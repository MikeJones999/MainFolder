/*
Create a static method that takes an array of integers and returns a linked list of integers in the same order as
the original array. You can put this method in a class called ListUtilities so that you can easily use it for the
following exercises.
Initialising an array with 15-20 elements is very easy with curly-brackets-notation, so it is common to create an
array and then convert it into a dynamic structure automatically.
*/



class ListUtilities
{
	
	//variables
	private int[] array;
	private ListUtilities arrayList;
	private int value;
	
	public ListUtilities(int[] array)
	{
	
		this.array = array;	
		this.arrayList = null;		
	}
	
	
	public static ListUtilities arrayToList()
	{
	  int count = this.array.length;
		//iterate through array placing it on the end of new list
		for (int i = 0; i < count; i++)
		{
			
			
			arrayList.value = array[i];
			arrayList.addListElement();
			QueueListStart.addQueue(yetAnotherQueue8);
		
		
		}
	
	
	}


	
	// this is a member method of class Queue - therefore can use its methods
	public void addListElement(ListUtilities newElement)
	{
		//if newQueuel object's "next Queue" is null - means no one after it 
		if(this.arrayList == null)
		{
			//nothing after Queue so add this one after it. list grows by 1
			this.arrayList = newElement;		
		} 
		else //there is something next to Queue
		{
			//call this again, moving one and adding our Queue
			this.arrayList.addListElement(newElement);
		};	
	}


}