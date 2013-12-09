
public class GenericNode 
{
	private GenericStackManager<Number> holder;
	
	public static void main(String[] args)
	{
		new GenericNode().start();
	}
	
	
	public void start()
	{
		
		
		GenericStackManager<Number> newStack = new GenericStackManager<Number>();
		holder = newStack;
		holder.push(new Integer(10));
		holder.push(new Integer(20));
		holder.push(new Double(30));
		holder.push(new Float(40));
		//newStack.push(new String("20"));
		
		newStack.printStack();
	}


}
