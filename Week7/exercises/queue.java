/*
3 Singly-linked lists
Create a linked list following the hospital and Queues example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. Check that you can
delete the first element too.
Hint: Note that you cannot delete the first element from inside the list because you need to update the pointer
QueueListStart. To add or delete the first element of a list, you must do it from outside the list.
*/


public class Queue 
{
	private String name;
	private int age;
	private String illness;
	private Queue nextQueue;
	private static int patientCount;
	
	public Queue(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextQueue = null;
	}
		
	// this is a member method of class Queue - therefore can use its methods
	public void addQueue(Queue newQueue)
	{
		//if newQueuel object's "next Queue" is null - means no one after it 
		if(this.nextQueue == null)
		{
			//nothing after Queue so add this one after it. list grows by 1
			this.nextQueue = newQueue;		
		} 
		else //there is something next to Queue
		{
			//call this again, moving one and adding our Queue
			this.nextQueue.addQueue(newQueue);
		};	
	}
	
	 //enter the first Queue - it then prints their details - checks if nextQueue is empty - 
	 //if not call this method again inserting the object found in the nextList.
	 public void printQueue(Queue newQueue) 
	 {
			System.out.println("---------------------------");
			System.out.println("\nNext Patient");
			System.out.println("---------------------------");
			
		System.out.println("Patient Name : " + newQueue.name);
		System.out.println("Age: " + newQueue.age);
		System.out.println("Illness: " + newQueue.illness);
		
	
		if (newQueue.nextQueue != null)
		{	
		    this.addPatientCount();
			nextQueue.printQueue(newQueue.nextQueue); 
		} else 
			{ 
				System.out.println("\n***********************");
				System.out.println("End of list");
				this.patientCount = 0;
			}
		
	 }
	
	 public void countPatients(Queue newQueue) 
	 {
			
		if (newQueue.nextQueue != null)
		{	
		    this.addPatientCount();
			nextQueue.countPatients(newQueue.nextQueue); 
		} else 
			{ 
				int total = this.patientCount;
				System.out.println("Total Count of patients: " + total);
				this.patientCount = 0;
			}
		
	 }
	
	
	
	
	
	public int patientCount()
	{
		return this.patientCount;
	}
	
	public void printPatientCount()
	{
		System.out.println("Count of patients: " + this.patientCount);
	}
	

	public void addPatientCount()
	{
		this.patientCount = this.patientCount + 1;
	}
		
	public void removePatientCount()
	{
		this.patientCount = this.patientCount - 1;
	}
	
	
	
	public String getQueueName(Queue currentQueue)
	{
		return currentQueue.name;
	}
	
		// this is a member method of class Queue
		// returns true if the Queue was found and removed, false otherwise
		public boolean deleteQueue(Queue Queue)
		{
			if (this.nextQueue == null) 
			{
				// Queue to remove was not found
				return false;
			}
			else if (this.nextQueue.name.equals(Queue.name)) 
					{
						// We found it! It is the next one!
						// Now link this Queue to the one after the next
						this.nextQueue = nextQueue.nextQueue;
						return true;
					} 
					else 
						{
							return this.nextQueue.deleteQueue(Queue);
						}
		}
	
}

