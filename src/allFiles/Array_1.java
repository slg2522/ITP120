package allFiles;

import java.util.Arrays;

/**Directions:
1) Write a method named Zero which accepts an integer array as an argument and stores the value zero(0) in each element.  
2) Write a loop which displays all the elements of an array. The array should contain at least 25 numbers representing grades (average or letter) of the students.
3) Write code that copies values from one array to the other. Your array could be of integer or character type and should be 100 elements long. */

public class Array_1
{
  
	//1) creates an array filled with zeros
		public static int[] Zero(int[] arrayZero)
		{
		  	for (int i = 0; i < arrayZero.length; i++)
            {
            	arrayZero[i] = 0;
        	}
          
          	return arrayZero;
		//
		}
	
		//2) write a loop to display all elements of array
		public static void studentGrades(int[] grades)
		{	
          	System.out.println("The grades are : ");
			for (int k = 0; k < grades.length; k++)
            {
              System.out.print(grades[k] + " , ");
            }
          
        }
  
		//3) 100 element long array and copy to another array
		public static int[] arrayCopy(int[] original)
		{
		//int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
			int [] copy = new int[original.length];
			for (int index = 0; index < original.length; index++) {
				copy[index] = original[index];
        	}
          	return copy;
		}
  
  
	public static void main(String[] args)
	{
		
      	//1) call to methods and definitions
      	int[] arraytest = {1,2,3,6,4,5};
        
        //System.out.println("Array test contains " + Arrays.toString(arraytest));
      	
        arraytest = Zero(arraytest);
      	
      	System.out.println("Array test contains " + Arrays.toString(arraytest));
      
      	//Adds space inbetween questions
        System.out.println(" ");
      
      	//2) call to methods and definitions
      	int[] grades = {90, 85, 70, 66, 59, 78, 93, 80, 54, 67, 89, 96, 100, 88, 68, 78, 83, 77, 95, 91, 82, 66, 73, 98, 75};
      	studentGrades(grades);
      
      	//Adds space inbetween questions
      	System.out.println(" ");
      	
      	//3) call to methods and definitions
      
     	int[] first100Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
      
      	System.out.println("The original array: " + Arrays.toString(first100Numbers));
      	System.out.println("The copied array: " + Arrays.toString(arrayCopy(first100Numbers)));
      	
      	//another way to copy arrays
      		int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
      		int[] copyArray = new int[101];
      		
      		//creates loop to fill array
      		for(int index = 0; index < originalArray.length; index++)
      			copyArray[index] = originalArray[index];
      		
      		//print both arrays to compare
      		System.out.println("Original array: " + Arrays.toString(originalArray));
      		System.out.println("Copy array: " + Arrays.toString(copyArray));
		
	}
		
	
}