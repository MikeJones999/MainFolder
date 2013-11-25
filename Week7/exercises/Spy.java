public class Spy 
{		
		//static member - belongs to class not each newly created object
		private static int spyCount = 0;
		private int id;
		
		
		public Spy(int ID) 
		{
			this.id = ID;
			spyCount++;
		}
		
		
		public void printSpyId()
		{
			System.out.println(this.id);		
		}
		
		public static void printNumberOfSpies() 
		{
			System.out.println("Number of Spies: " + spyCount);
		}
		
		// public void addSpy(Spy newSpy)
		// {
			// if (this.nextSpy == null) 
			// {
			// this means this is the last patient in the list
			// this.nextSpy = newSpy;
			// }
			// else 
				// {
				// this.nextSpy.addSpy(newSpy);
				// };
		// }
		
		public void die()
		{
			spyCount--;
				
		}
		
		// this is a member method of class Spy
		// returns true if the Spy was found and removed, false otherwise
		// public boolean die(Spy spy) 
		// {
			// if (this.nextSpy == null) 
			// {
				// patient to remove was not found
				// return false;
			// }
			// else if (this.nextSpy.id == spy.id) 
			// {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				// this.nextSpy = nextSpy.nextSpy;
				// removeSpy(spy);
				
				// return true;
			// }
			// else 
				// {
					// System.out.println("Spy " + this.nextSpy.id + "has been detected and killed");
					
					// return this.nextSpy.die(spy);
					
				// }		
		// }
		
		
		
		public static int getNumberOfSpies() 
		{
			return spyCount;
		}
	
	
}

