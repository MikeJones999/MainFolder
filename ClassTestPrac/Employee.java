class Employee extends Person
{
	private int employeeID;
	private String name;
	
	public Employee(String name, int employeeID)
	{
	
		//super(name);
		this.employeeID = employeeID;
		this.name = "Dave";
		new Employee(2, (1 > 3), "BB", "yoyo");
	}
	
	public Employee(int num, boolean val, String s1, String s2) 
	 {
	 //super(num - 1);
	 System.out.print(val ? s1 : s2);
	 
	 }
	
	
	public int getID()
	{
		return employeeID;
	}
	
	
	public String getName()
	{
		//String partial = super.getName();
		return ("Employee class name " + name);
		
	}
	
}