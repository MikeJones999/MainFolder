//Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point, print ”Yes”
//if the numbers were consecutive and increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and ”5,6,7,8,9,10,11,-1”
//should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”, and ”1,1,2,3,4,5,-1” should output ”No”.

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

	else if (num > max)
		{
		
		//println "up"
		 	if (num == (max + 1))
		 	{
		 	max = num
		 	seq = true
		 	}else 
		 		{
		 	 
		 		seq = false
		 		}
		
		}
		else 
		{
			max = num
			seq = false

		}

}
if (seq) {println "yes"} else {println "no"}