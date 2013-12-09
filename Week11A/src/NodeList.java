
public class NodeList
{
	public Node top;
	public Node bottom;
	
	
	public NodeList()
	{	
	}
	
	
	public void addPatient(Node newPatient)
	{
		if (isEmpty())
		{
			
			this.top = newPatient;	
			this.bottom = newPatient;	
		}
		else
			{
			 	top.setAbove(newPatient);
			 	
			 	newPatient.setBelow(top);			 	
			 	top = newPatient;							 	
			}

	}
	
	
	public void removePatient(String name)
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
					
					holder.above.below = null;
					holder.getAbove().setBelow(null);
					///////////////////////////////////////here
					bottom = holder.above;		
				}
				
				if (holder.above == null)
				{		
					holder.below.above = null;
					top.below = holder.below.above;				
					top = holder.below;					
				}
			
				if (holder.below != null && holder.above != null)
				{
					holder.above.below = holder.below;
					holder.below.above = holder.above;
				}		
							
			}

	}
	
	
	
	
	public void printList()
	{
		Patient holder = bottom;
	
		
		while (holder != null)
		{
			System.out.println(holder.getName());
			holder = holder.above;			
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
