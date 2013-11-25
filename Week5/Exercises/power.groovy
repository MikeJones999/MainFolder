/*
Create a class with a static method pow that takes to integers (base and exponent) and calculates the power,
e.g. pow(2,3) calculates 23.
Is it easy to do this both iteratively and recursively?

*/
/*
class CalculatePow
{

  int base
  int exponent


	static int powIterate (int b, int e)
	{
	int total = b
	
		 for (int i = 1; i < e; i++)
		 {
		    total = total * b
		  
		 }
	 return total
	}


	static int powRecursive (int b, int e)
	{
	        //if exponent (count) == 1 then mutiply by 1
		if (e == 1)
		{
		return b * 1
		}
		//else if exponent (count) > 1 - reduce exponent by 1 -
		else if (e > 1)
			{
			  e--
			}
		   //each time call b * exponent minus the 1
		   return b * (powRecursive(b, e))
		   
		   //line should look like
		   //b * b * b  ; for 2 * 3

	}






}

CalculatePow cal = new CalculatePow()
cal.base = 2
cal.exponent = 3
int res = cal.powIterate(cal.base, cal.exponent)
println res
*/


base = 2
exponent = 3
int res = powRecursive(base, exponent)
println res


	static int powRecursive (int b, int e)
	{
	        //if exponent (count) == 1 then mutiply by 1
		if (e == 1)
		{
		return b * 1
		}
		//else if exponent (count) > 1 - reduce exponent by 1 -
		else if (e > 1)
			{
			  e--
			}
		   //each time call b * exponent minus the 1
		   return b * (powRecursive(b, e))
		   
		   //line should look like
		  b * b * b * 1
		
	 
	}
