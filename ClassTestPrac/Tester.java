import java.util.ArrayList;


class Tester 
{

	public static void main (String[] args)
	{
		new Tester().start();
		
	}
	
	public void start()
	{
		//Employee e1 = new Employee("Mike", 12345);
		//new Employee(2, (1 > 3), "BB", "CD");
		//System.out.println("Returned Name from Superclass = " + e1.getName());
		
	/* 	ArrayList<String> list = new ArrayList<>();
		list.add ("P");
		list.add ("Q");
		list.add ("R");
		list.set (2, "S");
		list.add (2, "T");
		list.add ("U");
		System.out.println(list); */

				int result = fib(5);
	}
	
	public static int fib(int n) {
	if ((n == 1) || (n == 2)) {
	return 1;
	} else {
	System.out.println(n);
	int result = fib(n-1);
	System.out.println(n);
	int other = result + fib(n-2);	
	System.out.println(other);
	return result;
	}
	}

}