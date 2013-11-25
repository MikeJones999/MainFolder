//Write a program that requests two numbers from the user and then outputs the
//quotient and the remainder, e.g. if the user enters 7 and 3, your program should
//ouput something like “7 divided by 3 is 2, remainder 1”. You cannot use the
// “/” or “%” operators.

String first, second
print "please insert your first number: "
first = System.console().readLine()
println ""
print "please insert your second number: "
second = System.console().readLine()
println ""
int a = Integer.parseInt(first)
int b = Integer.parseInt(second)
int total = 0
int result
boolean complete = false
int count = 0
if (b > a)
{
 print "you cannot divide " + a + " by " + b
}
else
{
	//b is less than a
	while (!complete)
	{
	
	
	if (total < a)
	{
	 
	 total += b
	 print total
	 count++  //quotient
	}
	else 
	{
	total = total - b
	result = a - total
	complete = true
	}
	print total
	println result
	print "count = " + (count - 1)
	
	

	
	}
	
}
