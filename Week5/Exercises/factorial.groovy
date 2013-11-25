
int total = factorial(4)
print total

/*iterative
 int factorial(int n)
    {
        int tot = 1
        for(int i = 1; i <= n; i++) 
        {
           tot = tot * i
        
        }
	return tot
    }

*/


//recursively


int factorial(int n)
{
	if (n == 0)
	{
	return 1
	
	}
	
	return n * factorial(n-1)

}