/*
Create a program in which you define the following methods:

binary2decimal(String): takes from the user a binary number (with digits 0 and 1) and returns the corresponding
number in decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that
35 = 3 · 101 + 5 · 100, you can find that 100011 = 1 · 25 + 1 · 21 + 1 · 20.

decimal2binary(int): the opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time.

The program must offer a menu to the user with two options. The first one takes a binary number from the
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number
and returns a binary number. The program should use the methods defined.
*/
int binResult = 0


print "please insert a binary number to convert: "
String str = System.console().readLine()


binResult = binaryConvert(str)
print binResult







int binaryConvert (String binToCon)
{
//variables
int strLength = binToCon.length()
int total = 0
int count = 0
int binary = 0
String bin = ""
boolean complete = false
boolean invalid = false

 if (strLength == 0)
 {
   print "invalid line"
 }
   else if (strLength >0)
 	 {
  	    strLength = (strLength - 1)
	 }

//convert string to int
	while (!complete)
	{   
		bin = binToCon.charAt(strLength)
		binary = Integer.parseInt(bin)
		if (bin == '0')  
		{
			total = total + binary
		}
		else if (bin == '1')
		{
			binary = Math.pow(2, count)
				if (binary == 0)
				{
				 binary = 1
				}
			total = total + binary
		}
		else if (bin != '0' || bin != '1')
		{
		  println "invalid binary - can only use 0 or 1"
		  complete = true
		  invalid = true
		  total = 0
		  break
		}
		strLength--
		count++
		if (strLength == -1) {complete = true}
	}
	//return total value to binResult variable
	total
	
}