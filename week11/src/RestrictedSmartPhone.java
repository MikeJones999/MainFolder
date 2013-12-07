
public class RestrictedSmartPhone  extends SmartPhone 
{
	int age;
	public RestrictedSmartPhone(String brand, int age) 
	{
		//when creating class object this will pass the brand onto the super of this class (SmartPhone)
		super(brand);		
		this.age = age;
	}

	public void playGame(String gameName)
	{
		if(!ageChecker())
		{
			System.out.println("You are too young to play games");
		}
		else
		{
			super.playGame(gameName);
		}
	}
	
	
	public boolean ageChecker()
	{

		if (this.age > 17)
		{	
			return true;
		}		
		
		return false;		
	}
	
}
