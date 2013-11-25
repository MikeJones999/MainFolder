/*Write a program that reads some text from the user and then writes the same text on screen, but each letter on a
different line.
Now modify your program to write each word (as defined by spaces) rather than letter on a different line.
*/

print " please insert a line of text: "
String str = System.console().readLine()

int strLength = str.length()


for (int i = 0; i < strLength; i++)
{
	
	print str.charAt(i)
	if (str.charAt(i) == ' ')
	{
	println "found space"
			
	}

}
