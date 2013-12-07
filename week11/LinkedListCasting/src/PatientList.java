
public class PatientList 
{
	public Patient top;
	public Patient bottom;
	
	
	public PatientList()
	{	
	}
	
	public void addPatient(Patient newPatient)
	{
		if (isEmpty())
		{
			
			this.top = newPatient;	
			this.bottom = newPatient;	
		}
		else
			{
			 	top.above = newPatient;
			 	newPatient.below = top;			 	
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
			
				Patient holder = bottom;
				
				while (!holder.getName().equals(name))
				{						
					holder = holder.above;	
				}							
				
				System.out.println("To be deleted = " + holder.getName());		
			
				
				if (holder.below == null)
				{
					bottom.above = holder.above;
					holder.above.below = null;
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
