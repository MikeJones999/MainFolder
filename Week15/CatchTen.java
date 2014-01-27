/*
*	Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
*	something that is not a number, the program should complain and ask for a number again until 10 numbers have
*	been introduced.
b)
Modify the program so that it first asks how many numbers the user wants to enter, and then asks for the numbers.
The computer should complain if the user enters something that is not a number in both cases. Use methods to
prevent code repetitions.

*/

public class CatchTen 
{
	private static int total = 0;
	private int ave = 0;
	private int max = 0;
	private boolean complete = false;
	public static void main (String[] args)
	{
	
		new CatchTen().start();
	
	}

	public void start()
	{
	
		System.out.print("Please Insert a count total: ");	
		while (!complete)
		{
			this.readInput();
			if (!complete) 
			{ 
				System.out.print("Please Insert an Integer: ");		
			}
		}

	}


	public int average(int num, int total)
	{
		int result = num / total;
		return result;
	
	}
	
	public void readInput()
	{
		try
		{				
			String str = System.console().readLine();		
			int returnNum = Integer.parseInt(str);
			if (total == 0) {max = returnNum;}
			total = total + 1;
			if (total > 1)
				ave = ave + returnNum;			
		}
		catch (NumberFormatException ex)
		{
		  System.out.println("Not an integer - please try again");
			
		}
		
		if (total == (max + 1))		
		{
			
			complete = true;
			int result = average(ave, total);
			System.out.println("average total is: " + result);
			return;
		}
	
	}

}