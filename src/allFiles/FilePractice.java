package allFiles;

//import statements
import java.io.File;

/**@author Sabrina Groves
 * @version 1.0
 * @since 3/22/2021
 * 
 *  This practice problem checks if a file on the desktop, named "notes.txt" exists.*/

public class FilePractice
{
	public static void main(String[] args)
	{
		File x = new File("C:\\Users\\sabri\\Desktop\\notes.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " exists.");
		else
			System.out.println(x.getName() + " does not exist.");
	}
}
