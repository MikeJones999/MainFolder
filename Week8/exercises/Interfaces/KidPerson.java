
public class KidPerson implements Person 
{

	private int situation;
	private int energy;	
	
	public KidPerson(int situation, int energy)
	{
		this.situation = situation;
		this.setEnergy(energy);	
	}
	
	@Override
	public void move(int distance) 
	{
		for (int i = 0; i < distance; i++) 
		{
		situation++;
		setEnergy(getEnergy() - 1);
		say("crawled forward");
		}
		
	}

	@Override
	public void say(String message) 
	{
		System.out.println (message);
		
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

}
