import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TestShortHash 
{
	@Test
	public void testHashUtilities()
	{
		Random rnd = new Random (1000000);
		for (int i = 0; i < 2000; i++)
		{
			int result = HashUtil.shortHash(rnd.nextInt());
			System.out.println("Testing " + result);
			assertTrue(result >= 0 && result <= 500);
		
		}
	}



}

//once compiled with javac TestSh
//java org.junit.runner.JUnitCore TestShortHash