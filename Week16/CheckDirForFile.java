import java.io.*;

public class CheckDirForFile
{
	public static void main(String[] args)
	{
		new CheckDirForFile().start();
	}
	
	public void start()
	{
	
		System.out.println("Please provide directory folder to search within. The folder route must start with '/': ");
		String strFold = System.console().readLine();
		
		System.out.println("Please now provide the file name you are looking for : ");
		String strFile = System.console().readLine();
		System.out.println("you typed: " + strFile);
		
		File dir = new File(strFold);
		
		//if directory exists - check the file specified with files in directory
		if (dir.exists())
		{
			String[] directoryConts = dir.list();
			System.out.println(directoryConts.length + " files found in that directory");
			
			for (int i = 0; i < directoryConts.length; i++)
			{
				// DEBUG //System.out.println(directoryConts[i]);
				//convert file looking for and file found to lower case to get a solid comparison 
				if (strFile.toLowerCase().equals(directoryConts[i].toLowerCase()))
				{
					System.out.println("File: " + directoryConts[i] + " found");
					printFileContents(directoryConts[i]);
					//break so no longer need to continue search
					break;
				}
				
			}
			
		}
		
		
	}

	//method for printing out contents of supplied file name (as string);
	public void printFileContents(String fileName)
	{
	
		//bufferedReader must be called from within try/catch statement - to catch any IOException
		try {
				
				FileReader file = new FileReader(fileName);
				//buffered reader to read the file
				BufferedReader buffer = new BufferedReader(file);
				//blank line that will provide itself as the out put from the line found in 
				String line = "";
				while ( (line = buffer.readLine()) != null)
				{
					System.out.println(line);				
				}
				//must close this once complete
				buffer.close();
				
			}
			catch(IOException e)
			{
				System.out.println("An error has occurred");			
			
			}
	
	
	}





}