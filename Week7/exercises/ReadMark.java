/*
Make a class that implements a method that reads a list of marks between 0 and 100 from the user,
one per line, and stops when the user introduces a -1. The program should output at the end (and
only at the end) how many marks there were in total, how many were distinctions (70–100), how
many were passes (50–69), how many failed (0–49), and how many were invalid (e.g. 150 or -3).
Use readLine() exactly once.
*/

class ReadMark
{
	//variables
	private int mark;
	private int dist;
	private int passes;
	private	int fails;
	private	int invalid;
	private int count;
	
	//constructor
	public ReadMark()
	{
		this.mark = 0;
		this.dist = 0;
		this.passes = 0;
		this.fails = 0;
		this.invalid = 0;
		this.count = 0;
	}
	
	public void addMark ()
	{
			int newMark = 0;
		
		do {
				System.out.println ("Please insert the mark: ");
				String str = System.console().readLine();
				newMark = Integer.parseInt(str);				
				String result = this.CheckMark(newMark);
				
					if (newMark != -1)
					{
					this.setAllResults(result);
					this.count++;
					};
				
		    }while (newMark != -1);
		
		System.out.println("\nComplete - no more Marks to enter");
	}

	//check the status of the mark and return String word result
	public String CheckMark(int nMark)
	{
		String result = "";
		if (nMark >= 101 || nMark < 0)
		{
			result = "invalid";
		}else if (nMark >= 70)
		{
			result = "dist";
		} else if (nMark >=50)
				{
					result = "pass";
				} else 
						{
							result = "fail";
						};			
		return result;
	}
	
	//set each category of mark
	public void setAllResults(String mark)
	{				
		if (mark.equals("invalid")) 
		{
			this.invalid = this.invalid + 1;
		};
		
		if (mark.equals("dist")) 
		{
			this.dist = this.dist + 1;
		};
		
		if (mark.equals("pass"))
		{
			this.passes = this.passes + 1;		
		};
		
		if (mark.equals("fail"))
		{
			this.fails = this.fails + 1;		
		};	
	}
	
	public void printResults()
	{
		System.out.println("Total Invalid marks: " + this.invalid);
		System.out.println("Total No. of Distinctions: " + this.dist);
		System.out.println("Total No. of Passes: " + this.passes);
		System.out.println("Total No. of fails: " + this.fails);		
		System.out.println("Total amount of numbers was: " + this.count);
	}
	
	
	public static void main (String[] args)
	{
		ReadMark mark = new ReadMark();		
		mark.addMark();
		mark.printResults();
		
		ReadMark mark1 = new ReadMark();		
		mark1.addMark();
		mark1.printResults();

	}

}


