import java.io.*;

//exists() - true if the file exists
// getName() - filename as a string
//lengtgh() - nyumber of bytes in the files, as a long type
//createNewFile() - true if able to create the new unique file
//delete() true if able to sucessfully delete the file
//renameTo(file) true id able to sucessfully rename the file
//list() an array of files or folder names as strings


public class ListFiles
{
	public static void main(String[] args)
	{
		//name File object for directory folder named "week16" - since running this from command line dont need h:\ etc
		File dir = new File("/source/MainFolder/week16");
		
		//if the above directory exists - look through it with list() command
		if(dir.exists())
		{
			//create and array to hold the files in the directory
			String[] files = dir.list();
			System.out.println(files.length + " files found...");
			//iterate through the files and print them on screen
			for (int i = 0; i < files.length; i++)
			{
				System.out.println(files[i]);
			}
		}
		else
		{
			System.out.println ("Folder not found.");
		}
	
	}



}