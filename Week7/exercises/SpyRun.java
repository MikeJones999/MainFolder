	class SpyRun
	{
		public static void main(String[] args)
			{
			
				boolean complete = false; 
				int count = 0;
				Spy spyListStart = null;
			
				
				// while(!complete)
				// {
					// System.out.print("Choose from following options...");
					// System.out.println("[0] Exit");
					// System.out.println("[1] Create New Spy");
					// System.out.println("[2] Kill a Spy");
					// System.out.println("[3] Kill ALL Spies");
					
					// String strInput = System.console().readLine();
					// int strInputInt = Integer.parseInt(strInput);
					
					// switch(strInputInt)
					// {
						// case 0: complete = true; System.out.println("\nExiting");
								// break;
						
						// case 1: 
						System.out.print("Please insert the ID of your new spy: ");
								String str = System.console().readLine();
								int strInt = Integer.parseInt(str);
								//how to call a method?
								// if (count < 1)
								// {
								// spy = new Spy(strInt);
								// spyListStart = spy;
								// int spyCount = spy.getNumberOfSpies();
								// System.out.println("Number of Spies in system: " + spyCount);
								// count++;
								// } else  {	spy = new Spy(strInt);
											// int spyCount = spy.getNumberOfSpies();										
											// System.out.println("Number of Spies in system: " + spyCount);
											// spyListStart.addSpy(spy);
										// };
								// break;
								
								// case 2: System.out.print("Please insert the ID of spy to delete: ");
										// str = System.console().readLine();									
										// strInt = Integer.parseInt(str);											
										// spy.die(spy);
										// int spyCount = spy.getNumberOfSpies();	
										// System.out.println(spyCount); 
										// break;
						
						
									// default: break;
					
					// };//switch
					
								Spy spy = new Spy(strInt);
								int spyCount = spy.getNumberOfSpies();
								System.out.println("Number of Spies in system: " + spyCount);
								
								
								System.out.print("Please insert the ID of your new spy: ");
								str = System.console().readLine();
								strInt = Integer.parseInt(str);
								Spy spy1 = new Spy(strInt);							
								spyCount = spy1.getNumberOfSpies();
								System.out.println("Number of Spies in system: " + spyCount);
								
								
								System.out.print("Please insert the ID of your new spy: ");
								str = System.console().readLine();
								strInt = Integer.parseInt(str);
								Spy spy2 = new Spy(strInt);							
								spyCount = spy2.getNumberOfSpies();
								System.out.println("Number of Spies in system: " + spyCount);
								
								spy2.die();
								spyCount = spy2.getNumberOfSpies();
								System.out.println("Number of Spies in system: " + spyCount);
				
				// };//while
			
			};//main
			
			
	}