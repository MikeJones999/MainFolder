class Persons
{
	public static void main(String[] args)
	{

	  String[] employName =  new String[10];
	  int[] employID = new int[10];
	  for (int i = 0; i < 2; i++)
	  {
		  System.out.println("Please insert the name of employee: ");
		  	  String name = System.console().readLine();
		  	  System.out.println("Please insert ID No. of employee: ");
		  	  String ident = System.console().readLine();
	          int identNum = Integer.parseInt(ident);

		      employName[i] = name;
		      employID[i] = identNum;

	  }


	 		int employLength = employName.length;
			System.out.println(employName[0].substring(0,1));

				  for (int j = 0; j < employLength -1; j++)
				  {
					  char firstLet = employName[j].charAt(0);

						if (firstLet == 'J')
						{
							System.out.println(employName[j]);
						}

			      }


	}


}








class Employee
{

  private String name;
  private int ident;

	  Employee(String name, int ident)
	  {
	     this.name = name;
	     this.ident = ident;
	  }

	  public String getName()
	  {
	    return name;
	  }

	  public int getIdent()
	  {
	    return ident;
	  }


}