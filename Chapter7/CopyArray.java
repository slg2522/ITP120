package allFiles;

import java.util.*;

public class CopyArray
{
	public static void main(String[] args)
	{
		//creates 2 arrays, 1st filled and 2nd to be filled
		int[] firstArray = {5, 10, 15, 20, 25};
		int[] secondArray = new int[5];
		
		//creates loop to fill array
		for(int index = 0; index < firstArray.length; index++)
			secondArray[index] = firstArray[index];
		
		//print both arrays to compare
		System.out.println("First array: " + Arrays.toString(firstArray));
		System.out.println("Second array: " + Arrays.toString(secondArray));
	}
}
