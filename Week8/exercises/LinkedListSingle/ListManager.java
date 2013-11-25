/** 
 * New person to be created
 * New person's NEXT person is assigned the reference of the previous link person
 * 
 * the The lists firstPerson is assigned a reference to the newest added person
 * 
 * firstPerosn = last person to join list
 * @author mikieJ
 *
 */


public class ListManager 
{
	//Remember Lists - First in last out
	
	//reference to first link in list/or last person added to list
	public Person firstPerson;
	
	public ListManager()
	{
		//if empty it is null - however this is standard
		firstPerson = null;		
	}
	
	public boolean isEmpty()
	{		
		//check to see if anyone is in list
		return(firstPerson == null);	
	}
	
	
	public void insertFirstPerson(String name, int age)
	{
		//created the newest person to add to the list
		Person newPerson = new Person(name, age);
		
		//connect the first link in list to this new link
		newPerson.nextPerson = firstPerson;
		
		//link first person to new Person created
		firstPerson = newPerson;
	}
	
	public Person removeFirst()
	{
		//return person to removed - store in a variable to return later - otherwise after unlink he is deleted 
		Person personReference = firstPerson;
		
		//check to ensure list of persons is not empty
		if(!isEmpty())
		{
			
			//last person to join previous person - that previous person becomes the last person in list
			firstPerson = firstPerson.nextPerson;
			
		}else
			{
				System.out.println("List is empty");
			
			}		
		
		//return the person deleted
		return personReference;

	}
	
	
	public void displayAll()
	{
		//create the last person in the list and iterate backwards until null
		Person wholeList = firstPerson;
		System.out.println("List of all Persons");
		System.out.println("*******************");
		
		while(wholeList != null)
		{
			//recursive loop of Persons Display
			wholeList.display();
			
			if(wholeList.nextPerson != null)
			{
				System.out.println("Next person: " + wholeList.nextPerson.getName());
			}
			
			//next persons.next person - become the wholelist - then loop around and check his next person
			wholeList = wholeList.nextPerson;
			
			System.out.println();
	
		}
		
		System.out.println("    End of List    ");
		System.out.println("*******************");
		System.out.println();
	}
		
		public Person findPerson(String name)
		{
			//create the last person in the list and iterate backwards until null or String name found	
			Person wholeList = firstPerson;
			
			if(!isEmpty())
			{
				//check all names against name provided
				while(!wholeList.name.equals(name))
				{
					//if the nextname is null means at the end of list
					if(wholeList.nextPerson == null)
					{
						return null;
					}
					else
						{						
							wholeList = wholeList.nextPerson;
						}					
				}
			}
			else{				
					System.out.println("Empty List");
				}	
			//return person found
			return wholeList;
		}
		
		
		
		public Person removeSpecificPerson(String name)
		{
			Person currentPerson = firstPerson;
			Person previousPerson = firstPerson;
			
			
			//searching through list for specific person
			while (!currentPerson.name.equals(name))
			{
				//if at last person in list
				if (currentPerson.nextPerson == null)
				{
					return null;
				}
				else 
					{
					//look in next list
					//current one that was not a match becomes previous Person + currentPerson's next person moves to
					//currentPerson - so that his next person can be searched
						previousPerson = currentPerson;
						
						//new Person we need to search for
						currentPerson = currentPerson.nextPerson;
					 
					}
				
			}
			
			
			//if a person with matching name found
			
			//if specific person is the last added
			if (currentPerson == firstPerson)
			{
				//means the first person (last added) is the specific person - we therfore just get his nextperson and make him the firstperson 
				firstPerson = firstPerson.nextPerson;	
			}
			else  //if person found was not the last in the list then
				{
					System.out.println("Found a match");
					System.out.println("CurrentPerson: " + currentPerson);
					System.out.println("firstPerson: " + firstPerson);
					
					previousPerson.nextPerson = currentPerson.nextPerson;
				}
			
			//Person found and that was deleted
			return currentPerson;
			
		}
		
		
		
		
		
}
	
	
	
	

