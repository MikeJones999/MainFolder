/*decimal2binary(int): the opposite of the previous one: takes a decimal number and returns the corresponding
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time.*/



print "please insert a decimal number to convert to binary: "
String str = System.console().readLine()
int decToInt = Integer.parseInt(str)



String decFinal = decimalConvert(decToInt)
println decFinal


String decimalConvert (int decimalToCon)
{
 //variables
 String decResult = ""
 String newDec = ""
 int decCarrier = 0
 int remainder = 0
 
 	//divide number by 2 and use remainder for binary
	while (decimalToCon > 0)
	{
		remainder = decimalToCon % 2
		//print remainder

		//println decCarrier
		decimalToCon = decimalToCon / 2

		decResult = decResult + "" + remainder
	}
	
	//place last number first in the string
	int decResultLength = decResult.length()
	for (int i = decResultLength -1; i > -1; i--)
	{
	  //print decResult.charAt(i)
	  newDec = newDec + "" + decResult.charAt(i)
	}
   newDec
}