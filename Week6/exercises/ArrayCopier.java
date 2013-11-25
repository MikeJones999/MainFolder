//copies arrays from one to the other

public class ArrayCopier
{

	private int[] array1;
	private int[] array2;

	ArrayCopier(int[] array1, int[] array2)
	{
	   this.array1 = new int[array1.length -1];
	   this.array1 = array1;

	   this.array2 = new int[array2.length -1];
	   this.array2 = array2;
 	}

	public int getArrayLength1()
	{
		int arLength = this.array1.length;
		return arLength;
	}

	public int getArrayLength2()
	{
		int arLength = this.array2.length;
		return arLength;
	}


	public int[] getArray1()
	{
		return this.array1;
	}

	public int[] getArray2()
	{
	
			return this.array2;
	}

	public int[] copyArray()
	{
		int arrayLen1 = this.array1.length - 1;
		int arrayLen2 = this.array2.length - 1;

		int total = arrayLen2 - arrayLen1;

		if (arrayLen1 == arrayLen2)
		{
			for (int i = 0; i < array2.length; i++)
					{
					this.array2[i] = this.array1[i];
					};

		}
		else if (arrayLen1 > arrayLen2)
		{
			for (int i = 0; i < array2.length; i++)
			{
					this.array2[i] = this.array1[i];
			};
		}
		else if (arrayLen1 < arrayLen2)
		{
			for (int i = 0; i < array1.length; i++)
			{
					this.array2[i] = this.array1[i];

			};
			//from end of one array to next
			for (int i = arrayLen1; i < array2.length; i++)
			{
					this.array2[i] = 0;
			};

		};
		return this.array2;

	}

}