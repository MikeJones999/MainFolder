boolean complete = false

while (!complete)
{

	println "please choose and option: "
	println "(1) addition: "
	println "(2) subtraction: "
	println "(3) mulitpliction: "
	println "(4) division: "
	println "(5) modulus: "
	println "(0) Exit: "

	String opt = System.console().readLine()
	int option = Integer.parseInt(opt)
	
	int newSum1 = 0
	int newSum2 = 0

	if (option != 0)
	{
		println "please insert a number: "
		String str = System.console().readLine()
		newSum1 = Integer.parseInt(str)
		println "please insert another number: "
		str = System.console().readLine()
		newSum2 = Integer.parseInt(str)
	}
	
	Calculator cal = new Calculator(newSum1, newSum2)
	
	switch (option)
	{
		case 0: complete = true
			println "Exiting"
			 break
	
	
		case 1: int total = cal.add(cal)
			println "addition sum = " + total
			break


		case 2: int total = cal.sub(cal)
			println "subtraction sum: " + total
			break

		case 3:  int total = cal.multi(cal)
			println "multiplication sum: " + total
			break

		case 4:  double total = cal.div(cal)
			println "division sum: " + total
			break

		case 5: int total = cal.mod(cal)
			println "modulus: " + total
			break

		default: complete = true
			 break

	}
	println ""
}