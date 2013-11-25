
public class Person 
{

	public String name;
	public int age;
	public Person nextPerson;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
			
	
	public void display()
	{
		
		System.out.println(name + ": " + "their age is: " + age);
		
	}
	
	public String getName()
	{		
		return name;
			
	}
	
}
