//Read five cards from the user. For each card, read the rank (1,2,3,4,5,6,7,8,9, 10,J,Q,K) and the suit (”spades”,
//”hearts”, ”diamonds”, ”clubs”). Each of the five cards must be valid before accepting the next one. Once the
//program has the five cards, it should tell the user what is the best hand she has got, as per the following list (from
//best to worst):
//Straigh flush: all cards are of the same suit and their ranks are consecutive. Note that they are probably not
//ordered as they were entered.
//Poker: four of the five cards have the same rank.
//Full House: three of a kind plus two of a kind.
//Flush: all cards share the same suit, but are not consecutive.
//Straight: all cards are consecutive, but not of the same suit.
//Three of a kind: three of the five cards have the same rank.
//Two pairs: two pairs (see below).
//Pair: two of the five cards have the same rank.
//Nothing: any other situation.

int max = 0
int count = 0
int card, cardA, cardB, cardC, cardD, cardE
String hand, handA, handB, handC, handD, handE
boolean complete = false
boolean flush = false
boolean poker = false
boolean fullhouse = false
boolean straight = false
boolean threekind = false
boolean twopairs = false
boolean pair = false
boolean nothing = true


while (count != 5 && !complete)
	{
		count++
		 print "insert a card number: "
		 String str = System.console().readLine()
		 
		 print "insert a card Suit: "
		 String suit = System.console().readLine()		 
		 hand = str.substring(0,1)
		 
		 
		
		 
		 
	//add card number/letter to card
		if (str == "J" || str == "Q" || str == "K")
		 {
			println "Letter " + str
			
			switch (count)
			{
			case 1:
				cardA = str
			break;
			case 2:
				cardB = str
			break;
			case 3:
				cardC = str
			break;
			case 4:
				cardD = str
			break;
			case 5:
				cardE = str
			break;
			
			default:
			  print "error"
			break;
			}

		 }
		 else
		 {
		 card = Integer.parseInt(str)
		 if (card > 0 && card < 11)
			{

				switch (count)
				{
				case 1:
					cardA = card
				break;
				case 2:
					cardB = card
				break;
				case 3:
					cardC = card
				break;
				case 4:
					cardD = card
				break;
				case 5:
					cardE = card
				break;

				default:
				  print "error"
				break;
				}

			}else 	{
				println "Invalid card"
				complete = true
				}

		 }
		 
		//add suit to hand 
		 if (suit == "spade" || suit == "hearts" || suit == "dimonds" || suit == "clubs")
		 {
		 	switch (count)
		 				{
		 				case 1:
		 					handA = suit
		 				break;
		 				case 2:
		 					handB = suit
		 				break;
		 				case 3:
		 					handC = suit
		 				break;
		 				case 4:
		 					handD = suit
		 				break;
		 				case 5:
		 					handE = suit
		 				break;
		 
		 				default:
		 				  print "error"
		 				break;
						}

		 
		 } else {
		 
		 	print"Not a suit error"
		 	count = 5
		 	}
		 	
		 if (count == 1)
		 {
		   max = num				
		 } else {	
		
		
				while (!complete)
				{

					if (num == (max + 1) || num == (max -1))
							{
							max = num
							seq = true
							} 
							else {		 	 
							       seq = false
							      }	

				} 	
		 	 }
		 	
		 	
		 	
		 	
		 	
		 	
		 
	}

println "Card A " + cardA + " " + handA
println "Card B " + cardB + " " + handB
println "Card C " + cardC + " " + handC
println "Card D " + cardD + " " + handD
println "Card E " + cardE + " " + handE

//Straight Flush



