package thirdTest;

import java.util.ArrayList;

public class RemoveArrayList
{
	public static void main(String[] args)
	{
		//create an empty array list with initial capacity of 5
		ArrayList<Integer> numbers = new ArrayList<Integer>(5);
		
		//use add() to add elements
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		//print the list size
		System.out.println("The size of the list is: " + numbers.size()); 
		
		//print all the elements one by one
		for (Integer element : numbers) 
		{
			System.out.println("Element: " + element);
		}
		
		//remove the 3rd position element
		numbers.remove(2);
		
		//print the new size
		System.out.println("The new size is: " + numbers.size());
		
		//print all the new elements
		for (Integer element : numbers)
		{
			System.out.println("Element: " + element);
		}
	}
}
