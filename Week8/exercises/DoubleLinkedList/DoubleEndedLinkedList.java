
public class DoubleEndedLinkedList
{
	//reference to the first (last added) and the last (created first);
	Person baseOfList;
	Person topOfList;
	
	
	//first position is the top of the list
	public void insertInFirstPosition(String name, int age)
	{
		Person theNewPerson = new Person(name, age);
		
		//check if the list is empty
		if(isEmpty())
		{
			//bottom person is the base of the list
			baseOfList = theNewPerson;			
		}	
		else
			{
				//if not empty then - top of the list previous person (above them) is newest Person created
				topOfList.personAbove = theNewPerson; 
			
			}
		
		//the newly created person's previous person or link (one below) is now that person who was previously the last person in the list (or top of list)
		theNewPerson.personBelow = topOfList;	
		
		//last in the list - newly created person goes to top of the list
		topOfList = theNewPerson; 			
	}
	
	
	public void insertInLastPosition(String name, int age)
	{
		Person theNewPerson = new Person(name, age);
		
		//check if the list is empty
		if(isEmpty())
		{
			//newest person is the top of the list
			topOfList = theNewPerson;			
		}	
		else {		
				//newly created persons previous person (person above them in the list) = is now the bottom of the list
				theNewPerson.personAbove = baseOfList;
			
				//putting the bottom persons new next person (person now below him) to the newly created person
				baseOfList.personBelow = theNewPerson;		
			 }
		
		//put newly created person in bottom position
		baseOfList = theNewPerson;
	}
	
	
	//check is last person added is null
	public boolean isEmpty()
	{		
		return (topOfList == null);
	}
	
		
	public void displayAll()
	{
		Person thePerson = topOfList;
		
		while(thePerson != null)
		{
			thePerson.displayPersonDets();		
			System.out.println("Next Person: " + thePerson.personBelow);
			thePerson = thePerson.personBelow;
			System.out.println();
		} 
			
	}
	
	
	public boolean insertAfterKey(String name, int age, int key)
	{
		Person theNewPerson = new Person(name, age);
		
			//start search at firstPerson and work backwards
			Person currentPerson = topOfList;
			
			while(currentPerson.age != key)
			{
				currentPerson = currentPerson.personBelow;
				
				if(currentPerson == null)
				{					
					return false;
				}
			}	
					if (currentPerson == baseOfList)
					{
						//bottom of list therefore person below should be null
						theNewPerson.personBelow = null;
						baseOfList = theNewPerson; 
					} else
							{
								theNewPerson.personBelow = currentPerson.personBelow;
								currentPerson.personBelow.personAbove = theNewPerson; 
							}
					
					theNewPerson.personAbove = currentPerson;
					currentPerson.personBelow = theNewPerson;
					return true;
					
		}

	
	
	
	//insert person according to age
	public void insertInOrder(String name, int age)
	{
		Person theNewPerson = new Person(name, age);
		
		Person previousPersonAbove = null;
		Person currentPerson = baseOfList;
		
		while((currentPerson !=null) && (age > currentPerson.age))
		{
			previousPersonAbove = currentPerson;
			currentPerson = currentPerson.personBelow;			
		}
		
		if (previousPersonAbove == null)
		{
			topOfList = theNewPerson;
		}else
			{
				previousPersonAbove.personBelow = theNewPerson;
			}
		
		theNewPerson.personBelow = currentPerson;
	}
	
	
	
	
	
}
