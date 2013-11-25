
println "please chose from one of the following "
println "[0] convert decimal to binary"
println "[1] convert binary to decimal"

String str = System.console().readLine()
int option = Integer.parseInt(str)

switch (option)
{
	case 0:	 print "please insert a decimal number to convert to binary: "
	str = System.console().readLine()
	int decToInt = Integer.parseInt(str)
	String decFinal = decimalConvert(decToInt)
	println decFinal
	break


	case 1:	print "please insert a binary number to convert: "
	str = System.console().readLine()
	int binResult = binaryConvert(str)
	print binResult
	break

	default: println "exiting"	
	break	
}



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