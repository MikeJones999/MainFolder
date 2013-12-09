

public class GenericStackManager<T> implements GenericStack<T>
{

	private T[] contents;
	private int headIndex;
	
	
	public void push(T num)
	{
		contents[headIndex] = num;
		headIndex++;		
	}

	public T pop(T num) 
	{
		
		if (headIndex == 0) 
		{
			return null;
		}
			headIndex--; //because its in an array
			
			T result = contents[headIndex];
			contents[headIndex] = null;
			
			return result;
	}

	@Override
	public boolean checkEmpty()
	{
		for (int i = 0; i < headIndex; i++)
		{
			if (contents[headIndex] == null)
			{
				return false;
			}		
			
		}
		return true;
		
	}

	@Override
	public void printStack() 
	{
		
		for (int i = 0; i < headIndex; i++)
		{
			if (contents[headIndex] != null)
			{
				System.out.println(contents[headIndex]);
			}		
			
		}
	}

	


}
