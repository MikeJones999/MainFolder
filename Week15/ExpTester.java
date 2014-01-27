import java.util.*;
import java.util.ArrayList;

public class ExpTester 
{

	public void start(Integer newElement)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
		
		list.add(newElement);
	
		} catch (NullPointerException ex) {
		ex.printStackTrace();
		} catch (Exception ex) {
		ex.printStackTrace();
		}
	}


		public static void main (String[]args)
		{
			Integer num = new Integer(4);
			new ExpTester().start(num);
		}

}