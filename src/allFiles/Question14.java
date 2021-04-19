package allFiles;

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Question14
{
	public static void main(String[] args)
	{
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			} 
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
		//assign the file to a variable called myfile
		File myfile = new File("filename.txt");
		//if the file exists, print the designated message
		if (myfile.exists())
		{
			System.out.println("This CodeSuccessfully wrote to the file.");
		}
	}
}
