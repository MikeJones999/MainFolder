/*
3 Singly-linked lists
Create a linked list following the hospital and patients example of the notes:
1. Create the linked list and add several elements to it (around 10 is fine).
2. Go through the list printing out the content of each element.
3. Delete a couple of elements from the list.
4. Print the elements in the list again. Check that the deleted elements have been deleted. Check that you can
delete the first element too.
Hint: Note that you cannot delete the first element from inside the list because you need to update the pointer
patientListStart. To add or delete the first element of a list, you must do it from outside the list.
*/


public class Patient 
{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
		
	
	
}

