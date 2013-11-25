/*
3 Singly-linked lists
Create a linked list following the hospital and patients example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. Check that you can
delete the first element too.
Hint: Note that you cannot delete the first element from inside the list because you need to update the pointer
patientListStart. To add or delete the first element of a list, you must do it from outside the list.
*/


public class DoublePatient 
{
	private String name;
	private int age;
	private String illness;
	private DoublePatient nextPatient;
	private DoublePatient previousPatient;
	
	public DoublePatient(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
		
	// this is a member method of class Patient - therefore can use its methods
	public void addPatient(DoublePatient newPatient)
	{
	
		if(this.nextPatient == null)
		{		
			//nothing after patient so add this one after it. list grows by 1			
			this.nextPatient = newPatient;	
			this.nextPatient.previousPatient = this.nextPatient;
		} 
		else //there is something next to patient
		{
			//call this again, moving one and adding our patient
			this.nextPatient.addPatient(newPatient);
		};	
	}
	
	 //enter the first patient - it then prints their details - checks if nextPatient is empty - 
	 //if not call this method again inserting the object found in the nextList.
	 public void printPatient(DoublePatient newPatient) 
	 {
			System.out.println("---------------------------");
			System.out.println("\nNew Patient");
			System.out.println("---------------------------");
			
		System.out.println("Patient Name : " + newPatient.name);
		System.out.println("Age: " + newPatient.age);
		System.out.println("Illness: " + newPatient.illness);
	
		if (newPatient.nextPatient != null)
		{	
		
			nextPatient.printPatient(newPatient.nextPatient); 
		} else 
			{ 
				System.out.println("\n***********************");
				System.out.println("End of list");
			}
		
	 }
	
	
	public String getPatientName(DoublePatient currentPatient)
	{
		return currentPatient.name;
	
	}
	
		// this is a member method of class Patient
		// returns true if the patient was found and removed, false otherwise
		public boolean deletePatient(DoublePatient patient)
		{
			if (this.nextPatient == null) 
			{
				// patient to remove was not found
				return false;
			}
			else if (this.nextPatient.name.equals(DoublePatient.name)) 
					{
						// We found it! It is the next one!
						// Now link this patient to the one after the next
						this.nextPatient = nextPatient.nextPatient;
						return true;
					} 
					else 
						{
							return this.nextPatient.deletePatient(patient);
						}
		}
	
}

