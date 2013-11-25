
public class Link 
{

	public String name;
	public int age;
	public Link nextPerson;
	
	public Link(String name, int age)
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
