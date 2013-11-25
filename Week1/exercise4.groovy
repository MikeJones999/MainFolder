//Write a program that asks a number from the user, then says whether the
//number is prime or not.

print "please enter a number: "
str = System.console().readLine()
int i = Integer.parseInt(str)

if (i <= 0)
{
	print "that number cannot be divisible by 1"
} 
else
{
int t = i-1; 
boolean result = false;
	while ((t > 1) && (i % t != 0))
	{
	   
	  	
	   t--
	   print t	 
	}
	
	if (t == 1)
	{
	print "prime number"
	}
	else
	{
	print "not a prime number"
	}
	
}	