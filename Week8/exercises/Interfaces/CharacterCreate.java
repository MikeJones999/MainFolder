
public class CharacterCreate
{

	public static void main (String[] args)
	{
		CharacterCreate start = new CharacterCreate();
		start.launch();		
	}
	
	
	public void launch()
	{
		Person indiana = new KidPerson(0, 50);
		indiana.move(10);
		indiana.say("all done");	
		
		Person John = new AdultPerson(0, 100);
		John.move(10);
		John.say("too tired to carryon");
		
	}
	
	
}
