public class QueueRun
{
	private Queue QueueListStart = null;
	
	public static void main (String[] args)
	{	
		QueueRun start = new QueueRun();
		
		start.launch();	
	}
	
	public void launch()
		{	
			Queue firstQueue = new Queue("John", 33, "Tuberculosis");
			QueueListStart = firstQueue;
			
			Queue yetAnotherQueue = new Queue("Mary", 16, "Meningitis");
			QueueListStart.addQueue(yetAnotherQueue);
			
			Queue yetAnotherQueue1 = new Queue("Dave", 26, "herpes");
			QueueListStart.addQueue(yetAnotherQueue1);
			
			Queue yetAnotherQueue2 = new Queue("Paul", 33, "Genital Warts");
			QueueListStart.addQueue(yetAnotherQueue2);
			
			Queue yetAnotherQueue3 = new Queue("Tom", 96, "Elephantism");
			QueueListStart.addQueue(yetAnotherQueue3);
			
			Queue yetAnotherQueue4 = new Queue("Claire", 05, "Influenza");
			QueueListStart.addQueue(yetAnotherQueue4);
			
			Queue yetAnotherQueue5 = new Queue("Susan", 26, "NoAssAtAll Syndrome");
			QueueListStart.addQueue(yetAnotherQueue5);
			
			Queue yetAnotherQueue6 = new Queue("Pauline", 43, "Meningitis");
			QueueListStart.addQueue(yetAnotherQueue6);
			
			Queue yetAnotherQueue7 = new Queue("Adrian", 36, "In growing toe nail");
			QueueListStart.addQueue(yetAnotherQueue7);
			
			Queue yetAnotherQueue8 = new Queue("Dude", 52, "touretts");
			QueueListStart.addQueue(yetAnotherQueue8);
			
			//iterates from the Queue inserted onwards
			//QueueListStart.printQueue(firstQueue);
			
			//System.out.println("Count of patients: " + QueueListStart.patientCount());
			
			QueueListStart.countPatients(firstQueue);
			
			boolean complete = QueueListStart.deleteQueue(yetAnotherQueue4);
			
				
			if (complete) 
			{
				QueueListStart.printQueue(firstQueue);
				System.out.println(yetAnotherQueue4.getQueueName(yetAnotherQueue4) + " Has been removed from the system");
			} else 
					{
						System.out.println("Could not find " + yetAnotherQueue4.getQueueName(yetAnotherQueue4) + " in the System");
						
					};
			
            QueueListStart.countPatients(firstQueue);
	
		}
}