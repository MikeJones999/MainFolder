
public class TreeIntSet implements IntSet
{
	
	int value;
	TreeIntSet left;
	TreeIntSet right;
	
	public TreeIntSet(int num)
	{
		this.value = num;
	}
	

	@Override
	public void add(int num)
	{
		boolean valid = containsVerbose(num);
		if (valid)
		{
			System.out.println("Number already exists");
		}
		else if (num > this.value) 
		{
			if (right == null)
			{
				right = new TreeIntSet(num);			
			} 
			else 
				{
					right.add(num);
				}			
		} else {
					if (left == null) 
					{
						left = new TreeIntSet(num);
					}
						else 
							{
							  left.add(num);
							}
			   }
	}

	
	
	
	@Override
	public boolean contains(int num) 
	{
		if (num == this.value) 
		{
			return true;
		}
		else if (num > this.value) 
		{
			if (right == null) 
			{
				return false;
			} 
			else {
					return right.contains(num);
				 }
		} else 
			  {
				if (left == null) 
				{
					return false;
				} 
				else
				{
					return left.contains(num);
				}
		}
	}

	@Override
	public boolean containsVerbose(int num) {
		if (num == this.value) 
		{
			return true;
		}
		else if (num > this.value) 
		{
			if (right == null) 
			{
				return false;
			} 
			else {
					System.out.println("Checking number " + right.value);
					return right.containsVerbose(num);
					
				 }
		} else 
			  {
				if (left == null) 
				{
					return false;
				} 
				else
				{
					System.out.println("Checking number " + left.value);
					return left.containsVerbose(num);
				}
		}
	}

}
