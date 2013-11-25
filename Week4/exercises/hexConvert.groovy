/*Binary and hexadecimal
In mathematics and computer science, hexadecimal (also base 16, or hex) is a positional numeral system with a radix, or base, of 16. 
It uses sixteen distinct symbols, most often the symbols 0–9 to represent values zero to nine, and A,?B,?C,?D,?E,?F (or alternatively a–f) to represent values ten to fifteen. 
For example, the hexadecimal number 2AF3 is equal, in decimal, to (2?×?163) + (10?×?162) + (15?×?161) + (3?×?160), or 10995.
Each hexadecimal digit represents four binary digits (bits), 
and the primary use of hexadecimal notation is a human-friendly representation of binary-coded values in computing and digital electronics. 
One hexadecimal digit represents a nibble, which is half of an octet or byte (8 bits). 
For example, byte values can range from 0 to 255 (decimal), but may be more conveniently represented as two hexadecimal digits in the range 00 to FF. 
Hexadecimal is also commonly used to represent computer memory addresses.

*/
print "Please insert a letter: "
String str = System.console().readLine()
int num = 0
int total = 0
int multi = 0
int count = 0

if (str.substring(0,2) == "0x")
{
	println "Hexidecimal number entered"

	String newStr = str.substring(2)
	int newStrLength = newStr.length()

	for (int i = newStrLength - 1; i > -1; i--)
	{
		num = hexConvert(newStr[i])
		println num
		if (count == 0)
		{
		  total = total + num
		} else
			{
			multi = mulitplyHex(num, count)
			total = total + multi 
			}
		count++
	}
 
 println "Final Total is: " + total
}

int hexConvert(String input)
{
	switch (input)
	{
		case "A": num = 10 
		break
		case "B": num = 11
		break
		case "C": num = 12
		break
		case "D": num = 13
		break
		case "E": num = 14
		break
		case "F": num = 15
		break
		default: num = Integer.parseInt(input)
		break
	}
	num
}


int mulitplyHex(int newNum, int Counter)
{
  newNum = newNum * (16**Counter)
  newNum
}