
public class Patient 
{
	private String name;
	private String illness;
	private int age;
	
	public Patient above;
	public Patient below;
	
	
	public void setName(String name)
	{
		this.name = name;		
	}
	
	public void setAge(int age)
	{
		this.age = age;		
	}
	
	public void setIllness( String illness)
	{
		this.illness = illness;		
	}
	
	
	public String getName()
	{
		return name;		
	}
	
	public int getAge()
	{
		return age;			
	}
	
	public String getIllness()
	{
		return illness;		
	}
	
	
	
	
	
}
