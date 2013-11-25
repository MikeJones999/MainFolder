
public class Supermarket implements PersonQueue 
{

	   private QueueManager head;

	    public Supermarket() 
	    {
		  head = null;
	    }
	
	    
	    
	    /**
		* Adds another person to the queue.
		*/
	    // this is a member method of class Person - therefore can use its methods
		@Override		
		public void insert(Person newCust)
		{
			QueueManager newNode = new QueueManager(newCust);
			  if (head != null) {
				  newNode.setNext(head);
			  }
			  head = newNode;	  
		 }


		@Override
	    public Person retrieve() 
		{
	  	  if (head == null) 
	  	  {
	  		return null;
	  	  }
	  	  
	  	  Person result = head.getCust();
	  	  head = head.getNext();
	  	  return result;
	    }

	 

	    public Person peek() 
	    {
			  if (head == null) 
			  {
				return null;
			  } else {
				  		return head.getCust();
			  		 }
	    }

	    public boolean isEmpty() 
	    {
		  if (getSize() == 0)
		  	{
			  return true;
		  	} else {
		  			return false;
		  		   }
	    }

	    /**
	     * Returns the number of string in the stack
	     */
	    public int getSize() {
		  int result = 0;
		  QueueManager currentNode = head;
		  while (currentNode != null) 
		  {
			currentNode = currentNode.getNext();
			result++;
		  }
		  return result;
	    }
		
	

}
