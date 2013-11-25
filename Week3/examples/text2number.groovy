/*Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a
number that is half of it. Do not use Double.parseDouble().
If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.
*/

print "please insert a number: "
String str = System.console().readLine()
String numS = ""
int comPos = 0
int decPos = 0

int  strLength = str.length()

for (int i = 0; i < strLength; i++)
{
    
    /*
    	if (str.charAt(i) != ',' || str.charAt(i) != '.')
    	{
	    numS = numS + str.charAt(i)	    	
    	}
    */
    
	if (str.charAt(i) == ',')
	{
	  comPos = i
	
	}

	if (str.charAt(i) == '.')
	{
	 decPos = i
	
	}

}

String numWord = str.substring(0, decPos)
String comWord1 = numWord.substring(0, comPos)
String comWord2 = numWord.substring((comPos + 1))
String fullWord = comWord1 + comWord2

String decWord = str.substring((decPos + 1))

println fullWord
println decWord

int firstPart = Integer.parseInt(fullWord)
int secondPart = Integer.parseInt(decWord)

Double firstTotal = firstPart + 0.00
Double decimalP = secondPart / 100

Double total = (firstTotal + decimalP) / 2

//println firstTotal
//println decimalP
println total
