/*Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your
program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
0.10, 0.05, 0.02, 0.01) needed.
*/

//Math.abs() returns the absolute value of the number inside the brackets

print "Please insert the cost of purchase: "
String str = System.console().readLine()
Double cost = Double.parseDouble(str)

print "Please provide the money value to pay for the goods: "
str = System.console().readLine()
Double pay = Double.parseDouble(str)
Double change = 0
int notes = 0

if (Math.abs(cost)== Math.abs(pay))
{
 print "No Change requires - exact amount provided"
}
else if (Math.abs(pay) < Math.abs(cost))
	{
	println "You have not provided enough money"
	change = Math.abs(cost - pay)
	println "You owe " + change
	
	} else	{
			println "Calculating change"
			change = Math.abs(cost - pay)
			println change
			
			//NOTES
			if (change >= 50)
			{
			 notes = CalculateNotes(change, 50)
			 change = CalculateChange(change, notes, 50)
			 println "Fifty Pounds: " + notes			
			}
			if (change >= 20)
			{
			 notes = CalculateNotes(change, 20)
			 change = CalculateChange(change, notes, 20)
			 println "Twenty Pounds: " + notes						
			}
			if (change >= 10)
			{
			 notes = CalculateNotes(change, 10)
			 change = CalculateChange(change, notes, 10)
			 println "Ten Pounds: " + notes						
			}
			if (change >= 5)
			{
			 notes = CalculateNotes(change, 5)
			 change = CalculateChange(change, notes, 5)
			 println "Five Pounds: " + notes						
			}
			if (change >= 1)
			{
			 notes = CalculateNotes(change, 1)
			 change = CalculateChange(change, notes, 1)
			 println "One Pounds: " + notes						
			}
			
			//COINS
				if (change >= 0.50)
				{
				 notes = CalculateCoins(change, 0.50)
				 change = CalculateChange(change, notes, 0.50)
				 println "Fifty Pences: " + Math.abs(notes)
				}
				
				if (change >= 0.20)
				{
				 notes = CalculateCoins(change, 0.20)
				 change = CalculateChange(change, notes, 0.20)
				 println "Twenty Pences: " + notes						
				}
				if (change >= 0.10)
				{
				 notes = CalculateCoins(change, 0.10)
				 change = CalculateChange(change, notes, 0.10)
				 println "Ten Pences: " + notes						
				}
				if (change >= 0.05)
				{
				 notes = CalculateCoins(change, 0.05)
				 change = CalculateChange(change, notes, 0.05)
				 println "Five Pences: " + notes						
				}
				if (change >= 0.01)
				{
				 notes = CalculateCoins(change, 0.01)
				 change = CalculateChange(change, notes, 0.01)
				 println "One Pences: " + notes			 
				}
			
					
		}

Double CalculateNotes (Double change, int noteType)
{
	Double changeNew = change / noteType
	if (changeNew > 0)
	{
	changeNew
	
	}
}

Double CalculateCoins (Double change, Double CoinType)
{
	Double changeNew = change / CoinType
	if (changeNew > 0)
	{
	int coinValue = changeNew
	coinValue	
	}
}


Double CalculateChange (Double change, int noteAmount, int noteType)
{
	if (noteAmount > 0)
	{
		Double changeNew = change - (noteAmount * noteType)
		if (changeNew > 0)
		{
		changeNew
		}
	}
}

Double CalculateChange (Double change, int noteAmount, Double noteType)
{
	if (noteAmount > 0)
	{
		Double changeNew = change - (noteAmount * noteType)
		if (changeNew > 0)
		{
		changeNew
		}
	}
}

