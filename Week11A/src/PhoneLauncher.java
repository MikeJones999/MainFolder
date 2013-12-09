

public class PhoneLauncher
{
	
		public static void main(String[] args) 
		{
			PhoneLauncher launcher = new PhoneLauncher();
			launcher.launch();
		}
			public void launch() 
			{
				RestrictedSmartPhone nokia = new RestrictedSmartPhone("Nokia", 16);
			//	SmartPhone nokia = new SmartPhone("Nokia");
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
				nokia.call("0023654213211");
				nokia.call("01792520400");
				nokia.call("0020999999219");
				nokia.playGame("Tetris");
				nokia.printLastNumbers();
				
				System.out.println("Brand of this phone is " + nokia.getBrand());
			}
			
}