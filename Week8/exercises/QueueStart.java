

public class QueueStart
{

	public static void main (String[] args)
	{
		QueueStart start = new QueueStart();
		start.launch();		
	}
	
	
	public void launch()
	{
		PersonQueue firstQueue = new Supermarket();
		testQueue(firstQueue);
		
	}
	
	
	
	private void testQueue(PersonQueue queue)
	{
		 System.out.println("Testing the queue..."); 
		 queue.insert(new Person("Dave", 66));
		 queue.insert(new Person("Tom", 26));
		 
		 
		  while (!queue.isEmpty()) 
		  {
			    Person found = queue.retrieve();
				System.out.println("Next element: '" + found.getName() + "'");
		  }
		
		
		
		
	}
	
}