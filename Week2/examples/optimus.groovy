//optimus prime
/*Write a program that reads an integer number from the user, and then outputs the closest prime number. If there
are two prime numbers at the same distance, it should output both. For instance, if the user enters 5116, the output
should be 5113 and 5119.*/

print "Please Guess the number between 1 and 1000: "
String str = System.console().readLine()
int guess = Integer.parseInt(str)


int originalGuess = guess
int closest

int maxDown
int maxup
	  
boolean prime = true

	for (int i = 1; i < guess; i++)
	{	
	  
	  for (int j = 2; j < i ; j++)
	  {
	   if (i % j == 0) 
	   {
	  	prime = false	
	   }
	    
	  }	
	 if (prime == true) { println i; closest = i}
	
	
	if ((guess != guess -1) && (!prime)) {prime = true} 
	
	}  
	
	println "Closest to " + originalGuess + " is " + closest
	
	
	
	prime = false
	//upwards
	
	while (!prime)
	{
	
		if (guess % (guess + 1) == 0)
		{
		prime = true
		}
		
		
		if ((prime == true) && (guess != guess + 1 ) )
		{ println guess; guess++}
		else
		{
		 prime = false
		 println "Closest to " + originalGuess + " is " + guess
		 break
		}
	
	}
	



	
	
	
	