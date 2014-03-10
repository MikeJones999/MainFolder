import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class RunProg 
{

	private  HashMap<Integer, String> masterPages = new HashMap<Integer, String>();
	private  HashMap<Integer, String> masterEmails = new HashMap<Integer, String>();
	private  Integer pageCount = 0;
	private  Integer emailCount = 0;
	
	public static void main(String[] args) throws MalformedURLException
	{
					
		new RunProg().start();
		
		
	}
	
	public void start()
	{		
		SpamBot manager = new SpamBotImpl("http://www.oracle.com/");
		
		Set<String> returnedMail = manager.getEMails();
		System.out.println("***DEBUG*** Emails Returned: " + returnedMail.size());	
		for(String element: returnedMail)
		{
			System.out.println(element);
			
		}			
		
		Set<String> returnedPages = manager.getPages();
		System.out.println("***DEBUG*** Web Pages Returned: " + returnedPages.size());		
		for(String element: returnedPages)
		{
			System.out.println(element);
			masterPages.put(emailCount,element);
			emailCount = emailCount + 1;
		}	
		
		
		
		launch();
		
		
		System.out.println("***DEBUG*** WebSites: Threads");
		System.out.println("***DEBUG***: HashSize: " + masterPages.size() );
		for(Map.Entry<Integer, String> entry: masterPages.entrySet())
		{		
			//int key = entry.getKey();
			String temp = entry.getValue();
			System.out.println("***DEBUG*** Final Page: " + temp);
		}
		
	}
	
	
	
	
	public void launch()
	{
		int count = 0;
		
		while (!masterPages.isEmpty() && count < 4)
		{
			String temp = masterPages.get(count);
			masterPages.remove(count);
			SpamBot bug = new SpamBotImpl(temp);
			Set<String> returnedPages = bug.getPages();
			
			for(String element: returnedPages)
			{
				//System.out.println(element);
				masterPages.put(emailCount,element);
				emailCount = emailCount + 1;
			}	
			count = count + 1;
		}
		
		
		
		
	}
	
	
	
	
	
}
