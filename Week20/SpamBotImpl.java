
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SpamBotImpl implements SpamBot
{
	
	private String seed;
	private URL startSeed;
	
	//private static List<String> allPages = new ArrayList<String>();
	private Set<String> allPages = new HashSet<String>();
	private Set<String> allEmails = new HashSet<String>();
	//private static List<String> allEmail = new ArrayList<String>();
	
	
	public SpamBotImpl(String webAdd)
	{
		try {
			setSeed(webAdd);
			} catch (MalformedURLException e)
			{
			
			e.printStackTrace();
				System.out.println("***DEBUG**** bad url: " + webAdd );
			}
	}
	
	@Override
	public void setSeed(String seedUrl) throws MalformedURLException
	{
		try 
		{
			seed = seedUrl;
			startSeed = new URL(seed);
			scanSite();
		} 
		catch (MalformedURLException e)
		{
			System.out.println("***DEBUG**** bad url: " + seedUrl);
			e.printStackTrace();
		}
		
	}

	@Override
	public String getSeed() 
	{		
		return seed;
	}

	@Override
	public void scanSite() 
	{
		//make a new thread
		try {
				URLReader begin = new URLReader(seed);		
				allPages.addAll(begin.getFoundPages());
				allEmails.addAll(begin.getFoundEmails());				
				
			} 
				catch (Exception e) 
			{
			// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("***DEBUG**** bad url: " + seed);
			}
		
	}

	@Override
	public Set<String> getEMails() 
	{
		return allEmails;
	}

	@Override
	public Set<String> getPages() {
		// TODO Auto-generated method stub
		return allPages;
	}	

}
