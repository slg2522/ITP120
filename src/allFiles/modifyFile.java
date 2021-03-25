package allFiles;

/**This file modifies a pre-existing file.
 * @author Sabrina Groves
 * @version 1.0
 * @since 3/22/2021
 * */

//imports
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class modifyFile
{
	public static void main(String[] args) throws IOException
	{
		File newfile = new File("C:\\Users\\sabri\\Desktop\\notes.txt");
		
		Scanner scan = new Scanner(newfile);
		
		try 
		{
			if(!newfile.exists())
			{
				newfile.createNewFile();
			}
			
		//creates a new scanner for input from user
		Scanner keyboard = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(newfile);
		
		//asks user to enter text into the file
		System.out.println("Enter new text into this file");
		pw.println(keyboard.nextLine());
		
		//NEED TO GET THIS TO PRINT THE TEXT IN THE FILE
		while (scan.hasNext())
        { 
			System.out.println(scan.nextLine());
        }
		
		pw.close();
		
		//check if the action worked
		System.out.println("The compiler got to this step.");
		
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		//separate the getting of the file and reading of it
		System.out.println("");
		
	}
}
