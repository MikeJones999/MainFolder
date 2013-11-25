
//Write a program that reads three numbers and prints them in order, from lowest to highest.
int a

int top = 0
int middle = 0
int bottom = 0
int count = 0
boolean complete = false

while (count != 3)
	{
	
	print "please insert you a number: "	
	String str = System.console().readLine()
	a = Integer.parseInt(str)
	
	if (a > top)
	{
	bottom = middle
	middle = top	
	top = a
	
	println "new top " +  top
	println "new middle " +  middle
	println "new bottom " +  bottom
	} 
	else if (a > middle)
		{
		bottom = middle
		middle = a
		println "new middle " +  middle
		}
		else if (a > bottom)
			{
			bottom = a
			println "new bottom " +  bottom
			}
			
	count++
	
	
	}
println "Top = " + top
println "middle = " + middle
println "bottom = " + bottom


