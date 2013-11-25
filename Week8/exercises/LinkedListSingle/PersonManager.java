
public class PersonManager 
{

		public static void main(String[] args)
		{
			ListManager theLinkedList = new ListManager();
	
			theLinkedList.insertFirstPerson("John", 22);
			theLinkedList.insertFirstPerson("Dave", 32);
			theLinkedList.insertFirstPerson("Tom", 66);
			theLinkedList.insertFirstPerson("Steve", 56);
			theLinkedList.insertFirstPerson("Mike", 35);			
			
			theLinkedList.displayAll();
			
			theLinkedList.removeFirst();
			
			theLinkedList.displayAll();
			
			System.out.println(theLinkedList.findPerson("Tom").name + " was found");
			
		}
	
}
