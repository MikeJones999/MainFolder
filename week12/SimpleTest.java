import java.util.*;

import org.junit.*;
import static org.junit.Assert.*;

public class SimpleTest
{
	@Test
	public void testsNormalName()
	{
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
	
}