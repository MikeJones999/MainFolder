import java.util.ArrayList;

public class ResponsiveUI implements Runnable 
{
	private int sleeper;
	private static int counter;
	private static ArrayList<Integer> complete = new ArrayList<Integer>();
	
	private int taskNo = 0;
	
	public ResponsiveUI(int timer)
	{
		this.sleeper = timer;	
		taskNoInit(counter);
		counter = counter + 1;
	}	
	
		public void isComplete()
		{
			if (!complete.isEmpty())
			{
				System.out.print("Task Complete: ");
				for (int i = 0; i < complete.size(); i++)
				{
					System.out.print( complete.get(i) + ",");
				}
				System.out.println();
				//clears the arraylist
				complete.clear();
			}
			
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
				response.isComplete();
			}
			
			
		}


	public void run()
	{
	try {
			Thread.sleep(this.sleeper);
			//System.out.println("\n ***DEBUG*** Task: " + getTaskNo() + " finished");	
			complete.add(getTaskNo()); 
			
		} 
		catch (InterruptedException ex)
		{
		
		}
	
	}

	
	public void taskNoInit(int counter)
	{	
		taskNo = counter; 
	}

	public int getTaskNo()
	{
		return taskNo;
	}
}