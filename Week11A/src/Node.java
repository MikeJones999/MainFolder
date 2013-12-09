
public class Node<T> 
{
	
	//this can be our patient
	private T anything;
	
	
	//nodes for above and below
	private Node above;
	private Node below;
	
	public void setAbove(Node above)
	{
		this.above = above;
		
	}
	
	public void setBelow(Node below)
	{
		this.below = below;
		
	}
	
	public Node getAbove()
	{
		return above;
		
	}
	
	public Node getBelow()
	{
		return below;
		
	}
	
	public void setName(T name)
	{
		this.anything = name;		
	}
	
	
	public T getName()
	{
		return anything;		
	}


	
	
}
