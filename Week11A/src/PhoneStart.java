/*
 * 2.2 Direct upcasting
Change the script so that the SmartPhone is created with the line:
Mobilephone myPhone = new Smartphone();
Compile your code again. Are there any problems? Why do this problems happen? What are the possible
solutions?
2.3 Indirect upcasting when calling a method
Pass this object to a method testPhone(Phone) that has only one parameter of type Phone. What methods can
you call on the object inside the method?
2.4 Downcasting
Inside the former method, downcast the object to Smartphone so that you can use all the public methods of
Smartphone.
2.5 Casting exception
Create a MobilePhone object and then pass it to method testPhone(Phone). What happens?
 */

public class PhoneStart 
{

	public static void main (String[] args)
	{
		
		new PhoneStart().start();		
	}
	
	
	public void start()
	{
		MobilePhone myPhone = new SmartPhone("HTC");
		
		//direct casting
		((SmartPhone)myPhone).browseWeb("Arma");
		
		
		if(myPhone instanceof SmartPhone) 
		{
			System.out.println( myPhone.getBrand() + " is a SmartPhone" );
		}		
		if(myPhone instanceof MobilePhone) 
		{
			System.out.println( myPhone.getBrand() + " is a MobilePhone" );
		}
		if(myPhone instanceof Phone) 
		{
			System.out.println( myPhone.getBrand() + " is a Phone" );
		}
		
		//System.out.println("My GPS position is: " + myPhone.findPosition());
		myPhone.call("07876610392"); 
		//myPhone.playGame("Zombies");
		
		//testPhone(myPhone);
		
		MobilePhone superPhone = new SmartPhone("SamSung");
		testPhone(superPhone);
	}
	
	public void testPhone(Phone newPhone)
	{
		//can only use the interface of call with phone.
		System.out.println(newPhone);
		newPhone.call("07876610392");
		
		//does not work as addnum is a method of phone
		//newPhone.addNum("07876610392");
		SmartPhone temp = (SmartPhone) newPhone;
		
		temp.browseWeb("Whatever");
		
		
		//cannot cast mobile phone to smart phone
		//((SmartPhone)newPhone).browseWeb("Arma");
		
		
	}
	
}
