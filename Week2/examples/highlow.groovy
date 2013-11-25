//Modify goingup.groovy program so that it outputs ”Yes” when the numbers are consecutive, regardless of whether they
//go up or down. For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” should now result in ”Yes”.

int num
int max
int prev 
String str
boolean complete = false
boolean seq = false


print "Please insert a number: "
	str = System.console().readLine()
	max = Integer.parseInt(str)


while (!complete)
{
	print "Please insert a number: "
	str = System.console().readLine()
	num = Integer.parseInt(str)
	

	if (num == -1)
	{
	complete = true
	}
	else if (num == max)
	{
	   seq = false
	}
	else if (num == (max + 1) || num == (max -1))
		 	{
		 	max = num
		 	seq = true
		 	} 
		 	else {		 	 
		 	       seq = false
		 	      }	
	
}
if (seq) {println "yes"} else {println "no"}