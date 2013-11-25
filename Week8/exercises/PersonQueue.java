
public interface PersonQueue 
{
	/**
	* Adds another person to the queue.
	*/
	void insert(Person newCust);
	/**
	* Removes a person from the queue.
	*/
	Person retrieve();
	
	 boolean isEmpty();
	
}
