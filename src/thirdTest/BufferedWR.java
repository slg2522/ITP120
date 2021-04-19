package thirdTest;

import java.io.*;

public class BufferedWR
{
	public static void main(String[] args)
	{
		try
		{
			//create a buffered writer and buffered reader
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\sabri\\eclipse-workspace\\ITP120\\src\\thirdTest\\empty.txt"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sabri\\eclipse-workspace\\ITP120\\src\\thirdTest\\full.txt"));
			String s;
			//while there is still stuff to read, write the stuff line-by-line to the empty file
			while((s = br.readLine()) != null)
			{
				bw.write(s + "\n");
			}
			br.close();
			bw.close();
		}
		//catch all exceptions and return what they say
		catch (Exception ex)
		{
			return;
		}
	}
}
