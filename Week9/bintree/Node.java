
public class Node 
{
	int value;
	
	Node left;
	Node right;
	
	
	Node(int value)
	{		
		this.value = value;
	}
	
	public add(int newNumber)
	{
	   	if (newNumber > this.value) 
		{
			if (this.right == null)
			{
				this.right = new Node(newNumber);			
			} 
			else 
				{
					this.right.add(newNumber);
				}			
		} else {
					if (this.left == null) 
					{
						this.left = new Node(newNumber);
					}
						else 
							{
							  this.left.add(newNumber);
							}
			   }	
	}
	
	
	public boolean contains(int n)
	{
		boolean found = false;
		
		if (n == this.value) 
			{
				return true;
			} 
	
		if(this.right != null)
		{
			found = right.contains(n);
		}
	
		if(this.left != null)
		{
			found = found || left.contains(n);
		}

		return found;

	}
	
	
	
	
	
	
}
