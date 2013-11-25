
public class AdultPerson implements Person 
{
	private int situation;
	private int energy;	
	
	public AdultPerson(int situation, int energy)
	{
		this.situation = situation;
		this.energy = energy;	
	}

	@Override
	public void move(int distance)
	{
		for (int i = 0; i < distance; i++) 
			{
			this.situation++;
			this.energy--;
			say("moved one step");
			}
		
	}

	@Override
	public void say(String message)
	{
		System.out.println (message);		
	}

}
