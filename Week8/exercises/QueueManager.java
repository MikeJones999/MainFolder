

public class QueueManager
{
    private Person content;
    private QueueManager next;

    public QueueManager(Person cust)
    {
	  content = cust;
	  next = null;
    }

    /**
     * Returns the string in this node
     */
    public Person getCust() 
    {
	  return content;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(QueueManager head) 
    {
	  next = head;		
    }

    /**
     * Set the next node to point to the given node
     */
    public QueueManager getNext()
    {
	  return next;		
    }
}
