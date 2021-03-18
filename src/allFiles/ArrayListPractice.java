package allFiles;

import java.util.ArrayList;

public class ArrayListPractice
{
	public static void main(String[] args)
	{
		ArrayList<String> sampleAL = new ArrayList<String>;
		
		sampleAL.add("ITP 120");
		sampleAL.add(25, "ITE 119");  //gives the position where you want ITE119 to be added
		sampleAL.set(1, "ITP 120-1");  //replaces ITP 120 with the course section
		int totalSize  = sampleAL.size();
		sampleAL.indexOf("ITP 120-1");
		sampleAL.trimToSize(10);   //just saves space for program to run faster by only testing elements 0-10
	}
}
