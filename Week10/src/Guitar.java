
public class Guitar extends MusicalInstrument
{

	public static void main (String[] args)
	{
		Guitar zeplin = new Guitar();
		
		zeplin.start();
		
	}
	
	private void start() 
	{
		this.play();
		this.burn();
		
	}

	
	
	
}
