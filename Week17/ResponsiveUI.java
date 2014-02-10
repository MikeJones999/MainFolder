public class ResponsiveUI implements Runnable 
{
	private int sleeper;
		
	public ResponsiveUI(int timer)
	{
		this.sleeper = timer;	
	}	
	
	

	
		public static void main(String args[]) 
		{
			
			for (int i = 0; i < 10; i++) 
			{	
				System.out.print("Enter the duration (in ms) of task " + i + ":");
				String str = System.console().readLine();
				int timer = Integer.parseInt(str);
				ResponsiveUI response = new ResponsiveUI(timer);
				
				Thread t = new Thread(response);
				t.start();
			}
		}


	public void run()
	{
	try {
		Thread.sleep(this.sleeper);
		System.out.println("finished");	
		} 
		catch (InterruptedException ex)
		{
		
		}
	
	}



}