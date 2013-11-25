//Write a program that thinks of a random number between 0 and 1000, and then lets the user try to guess it.


int randNum = Math.abs(1000 * Math.random())

print "Please Guess the number between 1 and 1000: "
String str = System.console().readLine()
int guess = Integer.parseInt(str)
int count = 0
boolean complete = false


while  (!complete)
{
	if (guess == randNum)
	{
	 println "guessed Correctly"
	 complete = true
	} else if ( guess < randNum)
		{
		 println "incorrect - my number is higher"
		
		}else if (guess > randNum)
			{
			
			  println "incorrect - my number is lower"
			
			}
	
	if (!complete) 
	{
	print "Please insert another number: "
	str = System.console().readLine()
	guess = Integer.parseInt(str)
	}
count++

}

print "You took " + count + " guesses"