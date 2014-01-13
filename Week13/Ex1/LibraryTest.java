import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;


public class LibraryTest
{
	private BookImpl book1 = new BookImpl("Mike J", "how not to program!");

	/*
	@Before
	public void createObj()
	{
	}
	*/
	
	//Dont test whole code only test the methods!!!! 
	//create test before you create the objects
	
	@Test
	public void testsAuthorName()
	{		
		String output = book1.getAuthor();
		String expected = "Mike J";
		assertEquals(output, expected);
	}
	
	@Test
	public void testBookName()
	{
		String output = book1.getTitle();
		String expected = "how to program!";
		assertTrue(output.equals(expected));
	
	}
	
	
	@Test
	public void testUserName()
	{
		//create new user and setname - then retrieve name		
		UserImpl user1 = new UserImpl("John");
		String expected = user1.getName();
		int sumID = user1.getID();
		//System.out.println("ID: " + sumID);
		assertEquals(sumID, 0);
		user1.setID(123456);	
		sumID = user1.getID();
		assertEquals(sumID, 123456);		
	}
	
	@Test
	public void testLibraryName()
	{
		UserImpl user2 = new UserImpl("Paul");
		Node library = new Node("Birk");
		user2.register(library);
		String libName = user2.getLibrary();
		assertEquals(libName, "Birk");		
	}
	
	
	
	
	/*
	@After
	public void removeBook()
	{
	}
	*/

 //java org.junit.runner.JUnitCore LibraryTest
}