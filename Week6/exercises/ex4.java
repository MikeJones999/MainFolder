public class ex4
{
	public static void main(String[] args)
	{
		int[] array = new int[] {6,7,8,7,6};

		MatrixChecker arrayClass = new MatrixChecker(array);

		arrayClass.printArray();
		
		arrayClass.intToString();
		
		
		boolean retArray = arrayClass.RetIntToString();
		
		if (retArray == true)
		{System.out.println("Array is true");} else {System.out.println("Array is false");};
		
	}
}