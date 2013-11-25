//Rock - paper - scissors

print "Please insert rock, paper, or scissors: "
String str = System.console().readLine()

boolean complete = false
int count = 0
int compCount = 0

//rock beats scissors
//scissors beats paper
//paper beats rock



while (compCount != 3 && count != 3)
{

	if(str == "rock" || str == "paper" || str == "scissors")
	{
	//computer choice
	String[] anArray = ["rock", "paper", "scissors"]	
	int compGuess = Math.abs(3 * Math.random())
	String comp = anArray[compGuess]
	println "Computer guesses " + comp
	
	if ((str == "rock") && (comp == "scissors"))
	{
	  println "player wins a round"
	  count++	
	}else if (str == "rock" && comp == "paper")
		{
		println "Computer wins a round"
		compCount++
		} else if (str == "rock" && comp == "rock")
			{
			println "draw - no winner"			
			}
		
	if (str == "scissors" && comp == "paper")
		{
		  println "player wins a round"
		  count++	
		}else if (str == "scissors" && comp == "rock")
			{
			println "Computer wins a round"
			compCount++
			} else if (str == "scissors" && comp == "scissors")
				{
				println "draw - no winner"			
			}
	
	
	if (str == "paper" && comp == "rock")
		{
		  println "player wins a round"
		  count++	
		}else if (str == "paper" && comp == "scissors")
			{
			println "player wins a round"
			compCount++
			} else if (str == "paper" && comp == "paper")
				{
				println "draw - no winner"			
			}
	
	
	} 
	else
	   {
	    print "you have failed to insert rock, paper, or scissors"
	    complete = true		
	   }
	
print "Please insert rock, paper, or scissors: "
str = System.console().readLine()	
	

}

if (count > compCount) {print "Player wins!!!!!!!!!!!"} else {print "Computer wins!!!!!!!!!!!!!!"}
