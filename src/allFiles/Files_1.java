package allFiles;

/**@author Sabrina Groves
 * @version 1.0
 * @since 3/30/2021
 * 
 * Write a Java program to accomplish the following:
 * Ask the user to provide names for two files.
 * The first file should be opened for reading and the second for writing.
 * Write the names of your favorite sports teams in the first file.
 * Read the contents of the first file.
 * Convert the entire content to uppercase and save the outcome to the second file.
 * 
 * So in the end there should be two files with the exact content, but different cases.
 * Must submit the screenshot of the code, output window, and the two files with their names and contents visible.
 * 
 * 10 points for the file functioning
 * 10 points for the rest of the logical and syntaxtual aspects
 * 5 points for appropriate submission
 **/

//import statements
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Files_1
{
	//create a scanner
	public static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) throws IOException
	{
		//take in 2 file names from the user
		//file1
		System.out.println("Enter the path for the first file: ");
		String file1 = keyboard.nextLine(); 
		
		//file2
		System.out.println("Enter the path for the second file: ");
		String file2 = keyboard.nextLine();
		
		/**open or create file1 and enter favorite sports teams*/
		try
		{	
			//create a new filepath for file1
			File txt1 = new File(file1);
			
			//create a new file if needed
			if(!txt1.exists())
			{
				txt1.createNewFile();
			}
			
			//create a printwriter for file1
			PrintWriter pw = new PrintWriter(txt1);
			
			//add content to the file (favorite sports teams)
			//currently hard coded
			pw.println("Favorite Sports Teams:");
			pw.println("MLB: Washington Nationals");
			pw.println("NHL: Washington Capitals");
			pw.println("NWSL: Orlando Pride");
			pw.println("NFL: Baltimore Ravens");
			pw.println("NBA: Los Angeles Lakers");
			
			//flush the old contents
			pw.flush();
			pw.close();
			
			//tell user that action is complete
			System.out.println("Done with writing.");
			
			//separate reading and writing
			System.out.println("");
			
			//____________________________________________________
			
			//start reading
			Scanner reader = new Scanner (txt1);
			
			//read each line from file1
			System.out.println("File1 Contents:");
			
			//loop to read each line
			while (reader.hasNext())
			{
				System.out.println(reader.nextLine());
			}
			reader.close();
			
			//____________________________________________________
			
			
			/**Move text from file1 to file 2*/
			
			//create a new filepath for file2
			File txt2 = new File(file2);
			
			//if a new file is needed, create one
			if(!txt2.exists())
			{
				txt2.createNewFile();
			}
			
			//create a reader for file1
			Scanner reader2 = new Scanner (txt1);
			
			//create a printwriter for file2
			PrintWriter pw2 = new PrintWriter(txt2);
			
			//loop through each line of file1 and insert into file2 as uppercase
			String s;
			while (reader2.hasNext())
			{
				s = reader2.nextLine();
				pw2.println(s.toUpperCase());
			}
			
			//flush the garbage
			pw.flush();
			pw.close();
			
			//tell user that action is complete
			System.out.println("");
			System.out.println("Done with re-writing.");
			
			//close lots of stuff I forgot to close
			reader.close();
			pw2.flush();
			pw2.close();
			reader2.close();
			
//____________________________________________________
			
			//separate the new content
			System.out.println("");
			
			//start reading from file2
			Scanner reader3 = new Scanner (txt2);
			
			//announce this is file2
			System.out.println("File2 Contents:");
			
			//loop to read each line
			while (reader3.hasNext())
			{
				System.out.println(reader3.nextLine());
			}
			
			//close another scanner
			reader3.close();
//____________________________________________________
		}
		//catch the file exception
		catch (IOException e)
		{
			e.printStackTrace();
		}
		//close the main scanner
		finally
		{
			keyboard.close();
		}
	}
}
