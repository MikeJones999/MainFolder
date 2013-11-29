
public class OldPhone implements Phone 
{

	private String[] arrayList = new String[10];
	private String brand = null;
	
	
	public OldPhone(String brand) 
	{
		this.brand = brand;
	}
	
	
	@Override
	public void call(String number) 
	{
		System.out.println("Calling " + number);
		addNum(number);
	}
	

	public void addNum(String num)
	{
		
		//check last position
	  if (arrayList[9] == null)
		{
	
				for (int i = 0; i < 10;i++)
				{
					if (arrayList[i] == null)
					{
						arrayList[i] = num;
						return;
					}
				}
		} 
	  	else
		{
	  		String[] holder = new String[10];
	  		
	
			for (int j = 0; j < 9; j++ )
			{
				holder[j] = arrayList[j + 1];						
			}
			
			
			
			for (int i = 0; i < 10; i++ )
			{
				if (holder[i] != null)
				{
				
					arrayList[i] = holder[i];
					holder[i] = null;
				}
			}
			
			//add new number to the end - as last array element is empty
			arrayList[9] = num;
			
		}
	
	}
	
	
	public String[] getList()
	{		
		return arrayList;		
	}
	
	

	
	
	
	public String getBrand() 
	{
		return brand;
	}
	
	

}
