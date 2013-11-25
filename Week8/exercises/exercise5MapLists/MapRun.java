
public class MapRun 
{
	SimpleMaps HashMap;
	
	public MapRun()
	{
	  HashMap = new HashUtilities();	 
	}
	
	
	public static void main(String[] args)
	{
		new MapRun().launch();
		
	}
	
	public void launch()
	{
		Persons pep1 = new Persons();
		pep1.setName("mike");
		pep1.setNum(0);
		
		
		Persons pep2 = new Persons();
		pep2.setName("Dave");
		pep2.setNum(1);
		
		Persons pep3 = new Persons();
		pep3.setName("Steve");
		pep3.setNum(2);
		
		
		Persons pep4 = new Persons();
		pep4.setName("john");
		pep4.setNum(1);
		
		
		Persons pep5 = new Persons();
		pep5.setName("Tom");
		pep5.setNum(0);
	
		
		
		Persons pep6 = new Persons();
		pep6.setName("Bill");
		pep6.setNum(10);
		
		
		Persons pep7 = new Persons();
		pep7.setName("Barry");
		pep7.setNum(9);
		
		
		HashMap.put(pep1.getNum(), pep1.getName());
		
		//System.out.println(pep1.getName() + " is now at position " + pep1.getNum());
		
		HashMap.put(pep2.getNum(), pep2.getName());
		HashMap.put(pep3.getNum(), pep3.getName());
		HashMap.put(pep4.getNum(), pep4.getName());
	
		HashMap.put(pep6.getNum(), pep6.getName());
		HashMap.put(pep5.getNum(), pep5.getName());
		HashMap.put(pep7.getNum(), pep7.getName());
	}
	
}
