
public class MobilePhone extends OldPhone
{

	public void ringAlarm(String alarmType)
	{
		System.out.println("Alarm Ringing - type: " + alarmType);
	}

	public void playGame(String gameName)
	{
		System.out.println("Playing game: " + gameName);
		
	}
	
	
	public void printLastNumbers()
	{
		String[] num = getList();
		
		for (int i = 0; i < 10; i++)
		{
			if (num[i] != null)
			{
			System.out.println((i + 1) + ": Number called: " + num[i]);
			}

		}
		System.out.println("End of call data");
		
	}
	

	
}
