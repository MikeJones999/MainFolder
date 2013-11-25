//Write a program that read a (arbitrarily long) sequence of positive numbers. The sequence is ended when the users
//enters “-1”. At that point, the program must output the highest number in the sequence.


int a
int max = 0
String str
boolean complete = false

while (!complete)
{
	print "please insert a number: "
	str = System.console().readLine()
	a = Integer.parseInt(str)
	
		if (a == -1 )
		{
		 complete = true		
		
		}else if (a > max)
		{
		max = a	
		}

}


println "The highest number was " + max