import java.io.*;

public class ReadWriteFiles
{
	public static void main(String[] args)
	{
		new ReadWriteFiles().start();
	
	}


	public void start()
	{
	
		System.out.println("Please provide file search within.");
		String strFile1 = System.console().readLine();
		
		System.out.println("Please now provide the second file name you are looking to copy data to: ");
		String strFile2 = System.console().readLine();
		
		
		System.out.println("Copy from: " + strFile1 + " to: " + strFile2);
		
		
		File dir = new File("/source/mainfolder/week16");
		
		if (dir.exists())
				{
					String[] directoryConts = dir.list();
					System.out.println(directoryConts.length + " files found in that directory");
					
					for (int i = 0; i < directoryConts.length; i++)
					{
						// DEBUG //System.out.println(directoryConts[i]);
						//convert file looking for and file found to lower case to get a solid comparison 
						if (strFile2.toLowerCase().equals(directoryConts[i].toLowerCase()))
						{
							System.out.println("File: " + directoryConts[i] + " found");
							//printFileContents(directoryConts[i]);
							copyFileContents(strFile1, directoryConts[i]);
							//break so no longer need to continue search
							break;
						}
						
					}
					
				}
				else
				{
					System.out.println("Directory does not exist");
				}
	
	}

	//method for printing out contents of supplied file name (as string);
	public void copyFileContents(String sourceName, String destName)
	{	
		//bufferedReader must be called from within try/catch statement - to catch any IOException
		try {
				
				FileReader file = new FileReader(sourceName);
				//buffered reader to read the file
				BufferedReader buffer = new BufferedReader(file);
				
				FileWriter fileWite = new FileWriter(destName);
				BufferedWriter bufferWrite = new BufferedWriter(fileWite);
				
				//blank line that will provide itself as the out put from the line found in 
				String line = "";
				while ( (line = buffer.readLine()) != null)
				{
					System.out.println(line);	
					bufferWrite.write(line); 
					bufferWrite.newLine();
				}
				//must close this once complete
				buffer.close();
				bufferWrite.close();
				
			}
			catch(IOException e)
			{
				System.out.println("An error has occurred");			
			
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