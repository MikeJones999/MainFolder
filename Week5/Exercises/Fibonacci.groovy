
//new num gets value of last number
//then
//lastnum get value of total


int res = fib(3)
print res



/*iterate
int fib(int n)
{
int total = 0
int newNum =0
int lastNum = 0
	for (int i = 0; i < n; i++)
	{
	   if (i == 0)
	   {
	    newNum = 1	   
	   }
	   else
	   {
	    newNum = lastNum
	    lastNum = total
	   }
	   
	   total = total + newNum    
	   println total

	}

	return total //nth element to calculate
}
*/


//recursively

int fib(int n)
{
  if (n == 1 || n == 2)
  {
  	return 1
  } else
  	{
  	 
  	 int result = fib(n - 1) + fib (n - 2)
  	 return result
  	}
 
}


