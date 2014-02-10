
import java.io.*;

public class MakeDir
{

	//takes input from command line to create folder
	//however this is done at the run part of the call to the programm 
	//i.e java MakeDir testFolder
	//in this case a folder in the current directory is made call testFolder
	
	public static void main(String[] args)
	{
		try {	
		//first word after Class name is the 0 in the array of args....
				if (args[0] == null)
				{
					System.out.println("No folder name provided");
				}
				else
					{
						File dir = new File(args[0]);
						dir.mkdir();	
						System.out.println(dir + " folder has been created");
					}
			}
		catch(Exception e)
		{
			System.out.print("incorrect folder name type or missing");	
		
		}
	
	}





}

