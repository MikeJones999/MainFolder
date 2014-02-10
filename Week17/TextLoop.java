public class TextLoop implements Runnable 
{
	public static final int COUNT = 10;
	private final String name;
	public TextLoop(String name) 
	{
	this.name = name;
	}
	
		@Override
		public void run() 
		{
			for (int i = 0; i < COUNT; i++) 
			{
				System.out.println("Loop:" + name + ", iteration:" + i + ".");
			}
		}
		
	public static void main(String args[]) 
	{
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) 
		{
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} 
		
		//this is the deterministic thread - each object created calls the run method, completes, then new object is created and calls its run - all in order. 
		else if (args[0].equals("0")) 
		{
			for (int i = 0; i < 10; i++) 
			{
			Runnable r = new TextLoop("Thread " + i);
			r.run();
			}
		} else {
					//this is the option with the non locked threads - result many threads start at different times - iterations are sporadic 
					for (int i = 0; i < 10; i++) 
					{
					Runnable r = new TextLoop("Thread " + i);
					Thread t = new Thread(r);
					t.start();
					}
				}
	}
}