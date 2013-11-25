public class HashUtil
{
	/**
	private String num;
	
	public HashUtil(String num)
	{
		this.num = num;
	}
	
	
	public static int shortHash(int num)
	{		
		int numToConvert = num % 999;		
		//returns a positive number regardless
		return Math.abs(numToConvert);		
	}
	*/
	
	public static int shortHash(String num)
	{		
		int newNum = num.hashCode();
		
		int numToConvert = newNum % 999;		
		return numToConvert;		
	}

}