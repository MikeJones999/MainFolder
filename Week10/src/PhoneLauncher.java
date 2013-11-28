

public class PhoneLauncher
{
	
		public static void main(String[] args) 
		{
			PhoneLauncher launcher = new PhoneLauncher();
			launcher.launch();
		}
			public void launch() 
			{
					
				SmartPhone nokia = new SmartPhone();
				System.out.println(nokia.findPosition());
				nokia.call("07876610392");
				nokia.call("07876610392");
				nokia.call("07876610392");
				nokia.call("07878745431");
				nokia.call("999");
				nokia.call("101");
				nokia.call("07889654431");
				nokia.call("01792520400");
				nokia.call("02087754621");
				nokia.call("112");
				
				
				nokia.playGame("snake");
				nokia.printLastNumbers();
				
				
				nokia.call("333");
				nokia.call("07899654202");
				nokia.call("07876610392");
				
				nokia.playGame("Tetris");
				nokia.printLastNumbers();
			}
			
}