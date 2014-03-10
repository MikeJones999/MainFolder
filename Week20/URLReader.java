

import java.net.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.*;
/**
 * 
 * @author mjones28
 * Basic means to reading a webpage that returns HTML code
 * Weblinks are establish from <a href="http://etc </a>
 */
public class URLReader 
{
	private Set<String> foundPages = new HashSet<String>();
	private Set<String> foundEmails = new HashSet<String>();
	
	
	public URLReader(String webpage)
	{
		 			URL oracle;
				try {
						oracle = new URL(webpage);		 			
		     			BufferedReader in;		
						in = new BufferedReader(new InputStreamReader(oracle.openStream()));
				
				    	String inputLine;
		    	        while ((inputLine = in.readLine()) != null)        
		    	        {
		    	        	
		    	        	String[] arrayString = inputLine.split("\"");        	
		    	        	String result = this.findHTTP(arrayString);
		    	          //  System.out.println(inputLine);
		    	            
		    	        }   
		    	        in.close();
					}
	    	    	catch (MalformedURLException e)	    	    			
					{
					// TODO Auto-generated catch block
	    	    		System.out.println("***DEBUG**** MalformedURLException URLReader bad url: " + webpage);
	    	    		e.printStackTrace();
					}
					catch (IOException e)
					{
						System.out.println("***DEBUG**** IOException URLReader bad url: " + webpage);
					}
	}
	
	
	
	public Set<String> getFoundPages()
	{
		return foundPages;
	}
	
	public Set<String> getFoundEmails()
	{
		return foundEmails;
	}
	
	/*
    public static void main(String[] args) throws Exception 
    {

      // URL oracle = new URL("http://www.oracle.com/");
      //URL oracle = new URL("http://www.sistersofspam.co.uk/Scam_Email_Addresses_1.php/");
      //URL oracle = new URL("http://www.cyndislist.com");
        //URL oracle = new URL("http://www.which.co.uk/about-which/contact-us/");
        //URL oracle = new URL("http://www.jisc.ac.uk/contact");
        //URL oracle = new URL("http://www.bbk.ac.uk/contact-us");
    	
    	
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)        
        {
        	
        	String[] arrayString = inputLine.split("\"");        	
        	String result = manager.findHTTP(arrayString);
          //  System.out.println(inputLine);
            
        }   
        in.close();
    }
	 */

    public String findHTTP(String[] stringLine)
    {
    	String line = null;
    	
    	for(String element : stringLine)
    	{    
    		//System.out.println("Line array found: " + element);
    		if(element.length() > 3)
    		{
    			//System.out.println("***DEBUG*** less than 7: " + element );
	    		if (element.substring(0,4).equals("http"))
	    		{
	    			System.out.println("*********DEBUG*********WebSite found: " + element);
	    			line = element;
	    			foundPages.add(element);
	    		}  
	    		
	    		
	    		//System.out.println("***DEBUG*** Char 1: " + element.charAt(1));
	    		if (element.contains("@"))
	    		{	   
	    			
	    			try {	    				
			    		
				    		if (element.charAt(element.length()-1) != '@' || element.charAt(0) != '@' || element.charAt(1) != '@')
				    		{
				    			int pos = returnPosition(element);
				    			
				    			if (element.substring(0,7).equals("mailto:"))
				    			{
				    				element = element.substring(7);
				    				if (element.substring(element.length() - 1).equals("<"))
				    				{
				    					element = element.substring(7,element.length() - 1);
				    				}
				    			}
				    			
				    			
				    			else if (element.charAt(pos-1)!= ' ' || element.charAt(pos-1)!= ' ' )
				    				{
					    				if (element.substring(0,1).equals(">"))
						    			{
						    				element = element.substring(1);
						    				for (int i = 0; i< element.length(); i++)
						    				{
						    					if (element.charAt(i) == '<')
						    					{
						    						element = element.substring(0,i);						    						
						    					}
						    				}
						    			}
				    				}	    		
				    			
				    			//System.out.println("***DEBUG*** No cut: " + element);
				    				//check for spaces
				    				if (element.contains(" "))
				    				{
				    					int newPos = returnPositionSpaceBack(element, pos);
				    					element = element.substring(newPos+1);
				    					//System.out.println("***DEBUG*** First cut: " + element);
				   
				    					newPos = returnPositionSpaceForward(element, pos);
				    					element = element.substring(0,newPos);
				    					//System.out.println("***DEBUG*** Second cut: " + element);
				    				}
				    				//System.out.println("*********DEBUG*********Email found: " + element);
				    				foundEmails.add(element);
				    				
				    			}
				    		
	    				}
	    				catch (Exception e)
	    					{
	    						System.out.println("caught: URLREADER page");
	    					}
	    		}	
    		}
    	}
    	
    
    	return line;
    }

    public int returnPosition(String element)
    {
    	int pos = 0;
		for (int i = 0; i< element.length(); i++)
		{
			if (element.charAt(i) == '@')
			{
				pos = i;
			}
		}
		return pos;
		
    }
    
    public int returnPositionSpaceBack(String element, int pos)
    {
		for (int i = pos; i> 0; i--)
		{
			if (element.charAt(i) == ' ')
			{
				pos = i;
				return pos;
			}
		}
		return pos;	
    }
    
    
    public int returnPositionSpaceForward(String element, int pos)
    {    	
		for (int i = pos; i< element.length(); i++)
		{
			if (element.charAt(i) == ' ')
			{
				return i;
			}
		}
		return element.length();
    }
    
}

