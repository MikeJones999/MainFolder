/*
Make a class MatrixChecker with three methods:
• isSymmetrical(int[]) takes an array of int and returns true if the array is symmetrical and false otherwise.
An array is symetrical if the element at [0] is the same as the element at [length-1], the element at [1] is the
same as the element at [length-2], etc.
• isSymmetrical(int[][]) takes an bidimensional array of int and returns true if the matrix is symmetrical
and false otherwise. An matrix is symmetrical if m[i][j] == m[j][i] for any value of i and j.
• isTriangular(int[][]) takes an bidimensional array of int and returns true if the matrix is triangular1
and false otherwise. An matrix is triangular if m[i][j] == 0 for any value of i that is greater than j.
Add some methods to your Matrix class from the other exercise to perform tests on the matrices you create
using the methods from MatrixChecker. (Hint: these methods will need to create objects of type MatrixChecker).
*/


class MatrixChecker
{
	
	public int[] array;
   
	public MatrixChecker(int[] ary)
	{
		this.array = ary;	
	}
	
	public void printArray()
	{
		for (int i = 0; i < this.array.length; i++)
		{		
		    System.out.println(this.array[i] + "\n");
		};
	
	}
	
	public void intToString()
	{
		String str = "";
		for (int i = 0; i < this.array.length; i++)
		{			
			//place array in string and add spaces
			str = str + this.array[i] + " "; 			
		};		
		System.out.println(str + "\n");
	}
	
	
	public boolean RetIntToString()
	{
		String str = "";
		for (int i = 0; i < this.array.length; i++)
		{			
			//place array in string and add spaces
			str = str + this.array[i] + " "; 			
		};
		
		//System.out.println(str + "\n");
		
		//trim off any spaces outside string
		str = str.trim();
		
		//call - check and return resultif string is true or false
		boolean result = this.isSymmetrical(str);	
		
		return result;
	}
	
	//checks each row of the array[][] and sees if its symetrical
	public boolean RetMatrixIntToString()
	{
		String str = "";
		for (int i = 0; i < this.array.length; i++)
		{			
			//place array in string and add spaces
			str = str + this.array[i] + " "; 			
		};
		
		//System.out.println(str + "\n");
		
		//trim off any spaces outside string
		str = str.trim();
		
		//call - check and return resultif string is true or false
		boolean result = this.isSymmetrical(str);	
		
		return result;
	}
	
	//returns contents of array as string
	public String toString()
	{
		String newArr = "";
		String start = " [ ";
		String end = "] ";
		String semi = ";";
		newArr = newArr + start;
		for (int i = 0; i < (matrix.length); i++)
		{
			for (int j = 0; j < (matrix[i].length); j++)
			{
			  newArr = newArr + matrix[i][j];
			  newArr = newArr + ",";
			};
			newArr = newArr + semi;
		};
		newArr = newArr + end;
		return newArr;
	 }
	
	
	

		public boolean isSymmetrical(String input)
		{						
		    int inputLength = input.length();
				
			 if(inputLength == 0 || inputLength == 1)
			 {
			 return true;
			 };//if length =0 OR 1 then it is 	
				
				
			//check the charachter at start against that at the end	
			if (input.charAt(0) == input.charAt(inputLength - 1)) 
			{
			 //reduce the size of the string and recheck - that way 0 and length()-1 are always the same
			 return isSymmetrical(input.substring(1, input.length()-1));
			};
			
			//if the above check fails then it must not be a palindrome - return to RetIntToString()
			return false;
		}
}