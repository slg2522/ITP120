package allFiles;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview
{
	public static void main(String[] args)
	{
		//declare a new array
		int[] arrayName = new int[6];  //6 represents the number of elements, int is for integer
		
		//store elements
		arrayName[0] = 20; //0 is the first term
		
		//print out parts of array
		int[] days = {31, 28, 31, 30};
		
		//for loop to print
		for(int index = 0; index < days.length; index++)
		{
			System.out.println("There are " + days[index] + " days in month " + (index + 1) + ".");
		}
		
		//declare 3 int arrays
		int[] array1, array2, array3;
		
		//declare 1 int array and 2 integers
		int arrayA[], integerB, integer3;
		
		//enhanced for loop to easily see array contents
		int[] numbers = {3, 6, 9};
		for(int val : numbers)
			System.out.println(val);
		
		//__________________________________________________________________________________________________________
		
		//Lets the user pick number of elements in array
		Scanner keyboard = new Scanner(System.in);
		
		//get number of elements
		System.out.println("How many elements do you have?");
		int elements = keyboard.nextInt();
		
		//create array to hold number of elements in it
		int[] newarray = new int[elements];
		
		//get elements into array
		for(int index = 0; index < elements; index++)
		{
			System.out.println("Enter an element:  ");
			newarray[index] = keyboard.nextInt();
		}
		
		//display the elements
		System.out.println("Here are elements that you entered:");
		
		for(int index = 0; index < elements; index++)
			System.out.print(newarray[index] + " ");
		
		//Reassigning array reference variables from 10 elements to 5
		int[] hooray = new int[10];  //started with 10 spaces
		numbers = new int[5];        //reduced to 5
		
		//______________________________________________________________________________________________________________
		
		//creates 2 arrays, 1st filled and 2nd to be filled
				int[] firstArray = {5, 10, 15, 20, 25};
				int[] secondArray = new int[5];
				
				//creates loop to fill array
				for(int index = 0; index < firstArray.length; index++)
					secondArray[index] = firstArray[index];
				
				//print both arrays to compare
				System.out.println("First array: " + Arrays.toString(firstArray));
				System.out.println("Second array: " + Arrays.toString(secondArray));
				
		
		//arrays can be passed as arguments to methods by adding [] next to parameter type ex:
				//the main method is an example: public static void main (String[] args)
				
		//comparing arrays
		int[] arrayD = {2, 4, 6};
		int[] arrayE = {3, 5, 7};
		
		//boolean variable
		boolean arraysEqual = true;
		
		//are arrays same size
		if (arrayD.length != arrayE.length)
			arraysEqual = false;
		
		int index = 0;
		
		//do arrays contain same data
		while(arraysEqual && index < arrayD.length)
		{
			if(arrayD[index] != arrayE[index])
				arraysEqual = false;
			index++;
		}
		
		if(arraysEqual)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are not equal.");
		
		//______________________________________________________________________________________________________
		
		//get total
		int total = 0;
		for(int index = 0; index < arrayD; index++)
			total += arrayD[index];
		
		//get average
		double[] scores = new double[3];
		double total = 0;
		double average;
		for(int index = 0; index < scores.length; index++)
			total += scores[index];
		average = total/scores.length;
		
		//get highest and lowest
		int highest = arrayD[0];
		for(int index = 0; index < arrayD; index++)
		{
			if(arrayD[index] > highest)
				highest = arrayD[index];
		}
		
		//lowest
		int lowest = arrayD[0];
		for(int index = 0; index < arrayD; index++)
		{
			if(arrayD[index] < lowest)
				lowest = arrayD[index];
		}
		
		//_____________________________________________________________________________________________________________
		
		//partially filled arrays
		final int ARRAY_SIZE = 100;
				int[] array = new int[ARRAY_SIZE];
				int count = 0;
				
		System.out.println("Enter a number or -1 to quit: ");
		number = keyboard.nextInt();
		while(number !=-1 && count < array.length)
		{
			array[count] = number;
			count++;
			System.out.println("Enter a number or -1 to quit: ");
			number = keyboard.nextInt();
		}
		//display all the valid elements
			for(int index = 0; index < count; index++)
			{
				System.out.println(array[index]);
			}
		
		//_______________________________________________________________________________________________________________
		
		//Writes an array to a file
			
		//creates an array
		int[] numbers = {10, 20, 30, 40, 50};
		
		//opens the file
		PrintWriter outputFile = new PrintWriter("FileName.txt");
		
		//write elements to the file
		for(int index = 0; index < numbers.length; index++)
			outputFile.println(numbers[index]);
		
		//close the file
		outputFile.close();
		
		//_______________________________________________________________________________________________________________
		
		//open text file and read contents into array
		
		//loop control variables
		final int SIZE = 5;
		int[] numbers = new int[SIZE];
		int index = 0;
		
		//open the file
		File file = new File("FileName.txt");
		Scanner inputFile = new Scanner(file);
		
		//Read the file contents into array
		while(inputFile.hasNext() && index < numbers.length)
		{
			numbers[index] = inputFile.nextInt();
			index++;
		}
		
		//close scanner
		input.File.close();
		
		//_______________________________________________________________________________________________________________
		
		//return array from methods
		public static double[] getArray()  //call in main method
		{
			double[] array = {1, 2, 3, 4, 5};
			return array;
		}
		
	}
}
