
public class TreeSetRun 
{

	IntSet root;
	
	public static void main (String[] args)
	{
		new TreeSetRun().start();
		
	}
	
	public void start()
	{
		
		root = new TreeIntSet(10);
		root.add(11);
		root.add(12);
		root.add(12);
		root.add(11);
		root.add(10);
	}
		
}
