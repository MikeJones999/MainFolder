/*A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either
direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”.
Write a program that reads a text and detects whether the text is a strict palindrome.
*/

print "insert your word: "
String str = System.console().readLine()

int strLength = str.length()
boolean found = false
boolean MYDEBUG = true


int count = 0
int countMatch = 0

for (int j = 0; j < strLength; j++)
{
count++
	if ( (str.charAt(j)) == (str.charAt(strLength - count)) )
	 { 
	  if (MYDEBUG)
	  {
	   println "Palindrome"
	  }
	   countMatch++
	 } 
	 else
	 {
	  if (MYDEBUG)
	  {
	   println "not palindrome"
	  }
	 }
	
}

if (countMatch == strLength) 
{
print "Palindrome found!"
} else
	{print "no Palindrome found"}
