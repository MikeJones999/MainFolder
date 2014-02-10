import java.io.*;

//refer to list files for documentation on how this works

public class DirectoryFileSearch
{
	public static void main (String[] args)
	{
	
		new DirectoryFileSearch().start();
	
	}

	
		public void start()
		{
			
			System.out.print("Please type the folder you wish to search, starting with '/' :");
			String str = System.console().readLine();
			
			File dir = new File(str);
			
			if (dir.exists())
			{
			
				String[] directoryConts = dir.list();
				System.out.print (directoryConts.length + " Files found in " + str);
				for (int i = 0; i < directoryConts.length; i++)
				{
					System.out.println(directoryConts[i]);				
				}	
			} 
			else	{
						System.out.println("Sorry the folder you declared cannot be found - please check spelling...");					
					
					}

		}






}