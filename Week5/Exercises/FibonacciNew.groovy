



//fibonacci method

int fibonacci (int n)
{
	//due to the first three numbers in sequence being 0 1 1 - must return 0 or 1 - therefore create a base
	//for the numbers to reach - in this case 0
	if (n == 0) return 0
	if (n <= 2) return 1

	//get first previous indicies and second previous indicies
	int fib = fibonacci(n - 1) + fibonacci(n - 2)
	return fib
}