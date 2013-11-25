
public class HashUtilities implements SimpleMaps
{

	//reference to the first (last added) and the last (created first);
	public Persons bottomOfList;
	public Persons topOfList;
	
	
	
	public void putNormal(int key, String name)
	{
		//create a holder
		Persons newPersonHold = new Persons();
		newPersonHold.setName(name);
		newPersonHold.setNum(key);
		
		//check if whole map is empty = true is empty
		if(isEmpty())
		{
			bottomOfList = newPersonHold;	
			//topOfList is null anyway
		} 
		else			
			{
				//if not empty then - whoever is at the top of the list, their above person becomes the newest Person created
				topOfList.above = newPersonHold;
			}
		
		//the newly created person's previous person or link (one below) is now that person who was previously the last person in the list (or top of list)
		newPersonHold.below = topOfList;	
		
		//last in the list - newly created person goes to top of the list
		topOfList = newPersonHold; 		
		System.out.println(topOfList.getName() + " is now Top of the List");
	}
	
	@Override
	public void put(int key, String name)
	{
		Persons theNewPerson = new Persons();
		theNewPerson.setName(name);
		//minus one otherwise it is inserting after this number
		theNewPerson.setNum(key);
		
			if(bottomOfList == null)
			{
				System.out.println("Empty");
				bottomOfList = theNewPerson;	
				topOfList = theNewPerson;
			} 
			else		 
			{			
				//start search at firstPerson and work backwards
				 Persons currentPerson = new Persons();
				 currentPerson = topOfList;
				
				
				
				int holder = topOfList.getNum(); 
				System.out.println("Returned Key " + holder + ", Key to insert " + key);
				if (holder >= key)
				{	
					 //while current person houseNum > than the new person to insert 	 
					 //looking for house num to be same
						while(currentPerson != null && currentPerson.getNum() != key)
						{
								//person not found move to person below 
							currentPerson = currentPerson.below;
						    if (currentPerson.getNum() < key)
								{
									break;
								}
							//need something in here to detect keys that have not yet been put in
						}	
								
							System.out.println("CurrentPerson is: " + currentPerson.getName());
													
						if (currentPerson == bottomOfList && currentPerson.getNum() == key)
						{
							System.out.println("Bottom of the list - Position already in use - exit");
							theNewPerson.setNum();
							
						} 
						
						if 
						(currentPerson == bottomOfList && currentPerson.getNum() != key)
						{
							//bottom of list therefore person below should be null
							bottomOfList.above = theNewPerson;
							//bottom of list becomes person we created - generally the first
							theNewPerson.below = bottomOfList; 		
							
						}
								
						if (currentPerson != bottomOfList && currentPerson.getNum() == key)
						{
							System.out.println("Position already in use - exit");	
						}
						
						if (currentPerson != bottomOfList && currentPerson.getNum() != key)
						{
							//If list is not empty = newPersons below = currentPersons below							
							theNewPerson.above = currentPerson.above;
							
							currentPerson.above.below = theNewPerson;	
							
							int temp = currentPerson.above.below.getNum();
							temp = temp + 1;
							currentPerson.above.below.setNum(temp);
							currentPerson.above = theNewPerson;	
							theNewPerson.below = currentPerson;
							theNewPerson.setNum(theNewPerson.getNum() + 1);
							
						}
				} else
					{
						
						theNewPerson.below = topOfList;	
						topOfList = theNewPerson;
						System.out.println("New Person at Top of the List");
						System.out.println("******************************");
					}
				System.out.println(topOfList.getName() + " is now Top of the List");
				System.out.println(bottomOfList.getName() + " is now bottom of the List");
			}//else	
			
		
		}

	

	
	public static int shortHash(int num)
	{		
		int numToConvert = num % 999;		
		//returns a positive number regardless
		return Math.abs(numToConvert);		
	}
	
	
	public static int shortHash(String num)
	{		
		int numToConvert = Integer.parseInt(num) % 999;		
		return numToConvert;		
	}



	@Override
	public String get(int key) 
	{
		return null;
		
	}


	@Override
	public void remove(int key) 
	{		
	
	}


	@Override
	//returns true if the map is empty
	public boolean isEmpty()
	{		
		//create a placeHolder
		if(bottomOfList == null)
		{
			return true;
		}
	
			return false;

	}
}
