
public class NodeList
{
	public Node top;
	public Node bottom;
	
	
	public NodeList()
	{	
	}
	
	
	public void addNode(Node newNode)
	{
		if (isEmpty())
		{
			
			this.top = newNode;	
			this.bottom = newNode;	
		}
		else
			{
			 	top.setAbove(newNode);			 	
			 	newNode.setBelow(top);			 	
			 	top = newNode;							 	
			}

	}
	
	
	public void removeNode(String name)
	{
		if (isEmpty())
		{
			System.out.println("No patients to remove - list is empty");
				
		}
		else
			{
			
				Node holder = bottom;
				
				while (!holder.getName().equals(name))
				{						
					holder = holder.getAbove();	
				}							
				
				System.out.println("To be deleted = " + holder.getName());		
			
				
				if (holder.getBelow() == null)
				{
					bottom.setBelow(holder.getAbove());
					
					//holder.above.below = null;
					holder.getAbove().setBelow(null);
					///////////////////////////////////////here
					bottom = holder.getAbove();		
				}
				
				if (holder.getAbove() == null)
				{		
					holder.getBelow().setAbove(null);
					top.setBelow(holder.getBelow().getAbove());
					top.setBelow (holder.getBelow().getAbove());				
					top = holder.getBelow();					
				}
			
				if (holder.getBelow() != null && holder.getAbove() != null)
				{
					holder.getAbove().setBelow(holder.getBelow());
					holder.getBelow().setAbove(holder.getAbove());
				}		
							
			}

	}
	
	
	
	
	public void printList()
	{
		Node holder = bottom;
	
		
		while (holder != null)
		{
			System.out.println(holder.getName());
			holder = holder.getAbove();			
		}
		
	}

	
	
	public boolean isEmpty()
	{
		if (this.bottom == null)
		{
			return true;
		}
		return false;		
		
	}


	
}
