
public class ShortHash
{
	
	
	public int getHash(String name)
	{
		int num = name.hashCode();
		num = num % 30;
		return Math.abs(num);		
	}
	

}
