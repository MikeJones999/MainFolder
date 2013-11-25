
public class Person 
{
	public String name;
	public int age;
	
	//next is below a person
	public Person personBelow;
	
	//previous is person above
	public Person personAbove;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
	

	//display person details
	public void displayPersonDets()
	{
		if (this.name != null)
		{
		System.out.println("Name: " + name + " and their age is: " + age);
		} else
				{
					System.out.println("End of List");
				}
	}
	
	
	
	public String getName()
	{
		return name;
		
	}
	
	
}
