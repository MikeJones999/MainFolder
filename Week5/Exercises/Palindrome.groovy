/*
Create a program with a (recursive) method that takes a String paremeter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks.
Which one seems clearer to you?
*/

print "please inserta string word: "
String str = System.console().readLine()


//call the method to check given word
boolean complete = factorial(str)

if (complete)
{
 print "true"
}
  else {
	print "False"
       }



boolean factorial(String input)
{


 int inputLength = input.length()
		
     if(inputLength == 0 || inputLength == 1)
     {
     return true
     }       //if length =0 OR 1 then it is 	
		
		
	//check the charachter at start against that at the end	
	if (input.charAt(0) == input.charAt(inputLength - 1)) 
	{
	 //reduce the size of the string and recheck - that way 0 and length()-1 are always the same
	 return factorial(input.substring(1, input.length()-1))
	}
	
	//if the above check fails then it must not be a palindrome
	return false
}


