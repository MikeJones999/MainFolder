
public class MapRun
{

	public SimpleMap HashMap;
	
	public MapRun()
	{
	 HashMap = new HashUtilities(1000);
	 
	}
	
	
	public static void main (String[] args)
	{
			
		new MapRun().launch();
		
	}
	
	
	public void launch()
	{
		
		System.out.println("The map is " + HashMap.isEmpty());
		
		HashUtil key = new HashUtil();
		HashUtilities hu=(HashUtilities)HashMap;
		int newNum = hu.shortHash("mike");
		
		int newKey = key.shortHash("mike");
		HashMap.put(newKey, "mike");
		newKey = key.shortHash("Dave");
		HashMap.put(newKey, "Dave");
		newKey = key.shortHash("James");
		HashMap.put(newKey, "James");
		newKey = key.shortHash("John");
		HashMap.put(newKey, "John");
		
		
		HashMap.remove(1);
		
		System.out.println("Element at 2 is "  + HashMap.get(2));
		System.out.println("Element at 4 is "  + HashMap.get(4));
		System.out.println("The map is " + HashMap.isEmpty());
		
		
	}
	
	
}
