
public class SmartPhone extends MobilePhone 
{

	public SmartPhone(String brand)
	{
		//when creating class object this will pass the brand onto the super of this class (MobilePhone)
		super(brand);		
	}

	public void browseWeb(String wordLook)
	{
		System.out.println("Searching web for " + wordLook);
		
	}
	
	public double findPosition()
	{
		
		return 321.222;
	}
	
	//overrides same method in the superclass
	public void call(String number) 
	{
		if (checkNum(number) == true)
		{
			System.out.println("Calling " + number + " Via Internet");
			addNum(number);	
		}
			else
		{	
				//call the superclass instead of this one
				super.call(number);
				//System.out.println("Called from SuperClass");
		}
    }

	public boolean checkNum(String number)
	{
			
		
		if (number.substring(0,1).equals("0") && number.substring(1,2).equals("0"))
		{
			return true;	
		}
		
		return false;
	}
	
	public void playGame(String gameName)
	{
		System.out.println("Playing game: " + gameName);
		//super.playGame(gameName);
	}

	
}
