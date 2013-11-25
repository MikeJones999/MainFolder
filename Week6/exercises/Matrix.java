public class Matrix
{
  private int[][] matrix;

	//constructor
	public Matrix(int size1, int size2)
	{
		matrix = new int[size1][size2];
		for (int i = 0; i < (size1); i++)
			{
				for (int j = 0; j < (size2); j++)
				{
			      matrix[i][j] = 1;
				};

		};
	}

	//print whole matrix
	public void printMatrix()
	{
		System.out.println("\nTotal contents of Array");
		for (int i = 0; i < (matrix.length); i++)
		{
			System.out.print("\n");
			for (int j = 0; j < (matrix[i].length); j++)
			{
			  System.out.print(this.matrix[i][j] + " ");
			};
		};
		System.out.print("\n");
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


	public void prettyPrint()
	{
			System.out.println("\nTotal contents of Array(pretty)");
			System.out.print("[");
			System.out.print("\n");
			for (int i = 0; i < (matrix.length); i++)
			{
				for (int j = 0; j < (matrix[i].length); j++)
				{
				  System.out.print(this.matrix[i][j] + ", ");
				};
				System.out.print("\n");
			};
			System.out.print("]");
	}



	//prints contents of specific row
	public void printMatrixRow (int row)
	{
			for (int j = 0; j < (matrix[row].length); j++)
			{
				System.out.print(this.matrix[row][j] + " ");
			};

		System.out.print("\n");
	}



	//prints contents of specific Column
	public void printMatrixCol(int col)
	{
				for (int j = 0; j < (matrix.length); j++)
				{
					System.out.print(this.matrix[j][col] + " ");
				};
		System.out.print("\n");
	}


	//change element on row and column
	public void setElement (int pos1, int pos2, int newVal)
	{
		int size1 = this.matrix.length;
		int size2 = this.matrix[0].length;

		if ((pos1 <= (size1)) && (pos2 <= (size2)))
		{
			matrix[pos1][pos2] = newVal;
			this.printMatrix();
		}else
			{
				System.out.println("Array size you entered are bigger than the array positions");
			};
	}

	//removes commas from string numbers - returns
	public String removeComma(String row)
	{
		int rowLength = row.length();
		String newString = "";

		for (int i = 0; i < (rowLength); i++)
		{
			char toKeep = row.charAt(i);
 			System.out.println(toKeep);
			if (toKeep == ',')
			{
				newString = newString + "";
			};
		};
		//new string without commas
		return newString;
	}


	public int countStringArray(String row)
	{
		int rowLength = row.length();
		String newString = "";
		int count = 0;
		for (int i = 0; i < (rowLength); i++)
		{
			char toKeep = row.charAt(i);
 			//System.out.println(toKeep);
			if (toKeep == ',')
			{
				count++;
			};
		};
		count = count + 1;
		//new string without commas
		return count;
	}



		//change arrays row - via string input
		public void setRow(int row, String newVal)
		{
			int arraySize = countStringArray(newVal);
			System.out.println("String array for ROW has " + arraySize + " elements");
			int rowSize = this.matrix.length;
			int colSize = this.matrix[0].length;
			if ((arraySize <= colSize) && (arraySize <= rowSize))
			{
					int startPos = 0;
					int comPos = 0;
					int count = 0;
					int rowLength = newVal.length();
					for (int i = 0; i < rowLength; i++)
					{
							if (newVal.charAt(i) == ',')
							{
								  startPos = comPos;
								  comPos = i;

								  if (startPos == 0)
								  {
									  String comWord = newVal.substring(startPos, comPos);
									  int newInt = Integer.parseInt(comWord);
									  matrix[row][count] = newInt;
									  //System.out.println(newInt);
										count++;

								  } else if (i > 0)
											{
											  String comWord = newVal.substring(startPos + 1, comPos);
											  int newInt = Integer.parseInt(comWord);
											  matrix[row][count] = newInt;
											  //System.out.println(newInt);
												count++;
											};
							};
					};
					  String comWord = newVal.substring(comPos + 1);
					  int newInt = Integer.parseInt(comWord);
					  matrix[row][count] = newInt;
					  //System.out.println(newInt);
					  count++;
					  System.out.println(" ");
					  System.out.print("New Row is: ");
					  this.printMatrixRow(row);
					  this.printMatrix();
			};
		}


	//change arrays row - via string input
		public void setColumn(int col, String newVal)
		{
			int arraySize = countStringArray(newVal);
			System.out.println("String array has for COL " + arraySize + " elements\n");
			int rowSize = this.matrix.length;
			int colSize = this.matrix[0].length;
			if ((arraySize <= colSize) && (arraySize <= rowSize))
			{
					int startPos = 0;
					int comPos = 0;
					int count = 0;
					int colLength = newVal.length();
					for (int i = 0; i < colLength; i++)
					{
							if (newVal.charAt(i) == ',')
							{
								  startPos = comPos;
								  comPos = i;

								  if (startPos == 0)
								  {
									  String comWord = newVal.substring(startPos, comPos);
									  int newInt = Integer.parseInt(comWord);
									  matrix[count][col] = newInt;
									  //System.out.println(newInt);
										count++;

								  } else if (i > 0)
											{
											  String comWord = newVal.substring(startPos + 1, comPos);
											  int newInt = Integer.parseInt(comWord);
											  matrix[count][col] = newInt;
											  //System.out.println(newInt);
												count++;
											};
							};
					};
					  String comWord = newVal.substring(comPos + 1);
					  int newInt = Integer.parseInt(comWord);
					  matrix[count][col] = newInt;
					  //System.out.println(newInt);
					  count++;
					  //System.out.println(" ");
					  System.out.print("New Col is: ");
					  this.printMatrixCol(col);
			}else {System.out.println("Too many elements in array - exiting");};
		}



}

