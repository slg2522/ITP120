package allFiles;

import java.util.Arrays;

public class Array_1
{
	public static void main(String[] args)
	{
		Zero(arrayZero[0]);
		
	}
		//creates an array filled with zeros
		public int Zero(int[] arrayZero)
		{
		int [] arrayZero = {0, 0, 0, 0, 0};
		return arrayZero;
		//System.out.println("Array Zero contains " + Arrays.toString(arrayZero));
		}
	
		//write a loop to display all elements of array
		public int studentGrades(int[] grades)
		{
		int [] grades = {90, 85, 70, 66, 59, 78, 93, 80, 54, 67, 89, 96, 100, 88, 68, 78, 83, 77, 95, 91, 82, 66, 73, 98, 75};
		return grades[0];
		System.out.println("The grades are :" + Arrays.toString(grades));
		}
		
		//100 element long array and copy to another array
		public int arrayCopy(int[] original)
		{
		int [] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
		int [] copy = new int[100];
		for (int index = 0; index < original.length; index++)
			copy [index] = original[index];
		}
		
	
	
}
