//Write a program that prints all on screen all prime numbers up to 1,000.


boolean prime = true

	for (int i = 1; i < 1000; i++)
	{	
	  
	  for (int j = 2; j < i ; j++)
	  {
	   if (i % j == 0) 
	   {
	  	prime = false	
	   }
	   
	  }	
	 if (prime == true) { println i}
	prime = true
	}  
	
	


