
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
		
		//create a new word "mike" instead of string - and insert that"
		
		
		
		int newNum = hu.shortHash("mike");
		
		int newKey = key.shortHash("mike");
		HashMap.put(newKey, "mike");
		newKey = key.shortHash("Dave");
		HashMap.put(newKey, "Dave");
		newKey = key.shortHash("James");
		HashMap.put(newKey, "James");
		newKey = key.shortHash("John");
		HashMap.put(newKey, "John");
		
		
		HashMap.remove(key.shortHash("Dave"));
		
		System.out.println("Element at " + key.shortHash("John") + " is "  + HashMap.get(key.shortHash("John")));
		System.out.println("Element at " + key.shortHash("mike") + " is "  + HashMap.get(key.shortHash("mike")));
		System.out.println("The map is " + HashMap.isEmpty());
		
		
	}
	
	
}
