//import java.util.Arrays;


//every class implicitly or explicitly provides a hashCode() method which
//digests the data stored in an instance of the class into a single hash value (a 32-bit signed integer). 


public class HashUtilities implements SimpleMap
{


	private int mapSize;
	String[] theMap;
	

	
	//constructor
	public HashUtilities(int size)
	{
		this.mapSize = size;	
		this.theMap = new String[size];
	}
	
	public static int shortHash(String num)
	{		
		int newNum = num.hashCode();
		
		int numToConvert = newNum % 999;		
		return numToConvert;		
	}
	
	
	

	@Override
	public void put(int key, String name) 
	{
			
		//if the array element at position key is empty then place new string in it				
		if(this.theMap[key] == null)
		{
			this.theMap[key] = name;
			System.out.println(name + " is located at key: " + key);
		}
		else
			{
				System.out.println("Key " + key + " is in use by " + this.get(key));
			}
		
	}


	@Override
	public String get(int key) 
	{
		if(this.theMap[key] != null)
		{
			return this.theMap[key];
		}
		return null;
	}


	@Override
	public void remove(int key) 
	{		
		this.theMap[key] = null;
		System.out.println("Key " + key + " has been removed " + " it now returns " + this.theMap[key]);
	}


	@Override
	//returns true if the map is empty
	public boolean isEmpty()
	{
		for (int i = 0; i < (this.mapSize -1); i++)
		{
			if(this.theMap[i] != null)	
			{
				return true;
			}
		}
		return false;
	}

	 
	
}
