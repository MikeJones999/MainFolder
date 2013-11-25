
public class Persons 
{

	private String name;
	public int houseNum;
	public Persons below;
	public Persons above;
	
	
	public Persons()
	{
		//this.setName(name);
		//this.setNum(houseNum);		
	}
	
	
	public void setName(String name)
	{
		this.name = name;		
	}
	
	public void setNum(int houseNum)
	{
		this.houseNum = houseNum;		
	}
	
	public void setNum()
	{
		this.houseNum = 9999;		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public int getNum()
	{
		return this.houseNum;
	}
	
	
}
