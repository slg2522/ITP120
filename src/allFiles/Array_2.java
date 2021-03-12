package allFiles;

/**Homework answers for Array_2.
 * 
 *  @author Sabrina Groves
 *  @version 2.0
 *  @since 2021-03-04
 *  */

public class Array_2
{
	public static void main(String[] args)
	{
		/**Problem 1: Write the Java function below to print out all the Strings in
		 * the String array parameter in reverse order. (The String at the
		 * highest index should be printed first, then the String at the next
		 * highest index, and so on. The String at index 0 should be printed
		 * last.) */
		
		/**@param index: counts the reps through loop
		 * @param array1: an array full of strings
		 * Problem 1: I wrote into the main method bc didn't want another void method-- maybe I should change this*/
		
		String[] array1 = {"cat", "dog", "squirrel", "mouse"};
		
		System.out.println("Problem 1:");
		
		//Problem 1: One Option
		for(int index = 0; index < array1.length; index++)
			System.out.println(array1[(3-index)]);
		
		System.out.println(" ");
		System.out.println("An Alternate Solution for Problem 1:");
		
		//Problem 1: Another Option
		for(int index  = array1.length; index > 0; index--)
			System.out.println(array1[(index-1)]);
		
//_____________________________________________________________________________	
		
		System.out.println(" ");
		
		//Problem 2 array, variables, and call
		int[] array2 = {0, 1, 2, 3, 4, 5};
		int compare = 2;
		problem2(array2, compare);
		
		System.out.println(" ");
		
		//Problem 3 call
		courseWork();
		
		//Problem 4 array and call
		double[] array4 = {4.5, 7.8, 9.1, 3.3, 1.6};
		System.out.println(" ");
		System.out.println("Problem 4:");
		System.out.println("total: " + (problem4(array4)));
		
		//Average
		System.out.println("average: " + Av4(array4));
		
		//The numbers ordered
		System.out.println("The numbers ordered from greatest to least:");
		
		//Highest
		double first = highest(array4);
		System.out.println("max: " + highest(array4));
		
		//Second Highest
		double second = midhigh(array4);
		System.out.println("second: " + midhigh(array4));
		
		//Third Highest
		double third = mid(array4);
		System.out.println("third: " + mid(array4));
		
		//Second Lowest
		double fourth = low(array4);
		System.out.println("fourth: " + low(array4));
		
		//Lowest
		double fifth = lowest(array4);
		System.out.println("min: " + lowest(array4));
		
		System.out.println(" ");
		System.out.println("Ascending order:");
		
		//new array to hold values
		double[] newArray = {first, second, third, fourth, fifth};
		
		//ascending order
		for(int index  = newArray.length; index > 0; index--)
			System.out.println(newArray[(index-1)]);
		
	}

	
//_____________________________________________________________________________	
	
	/**Problem 3: Write a statement that declares a string array initialized with the
	 * classes you are taking this semester / year as elements.  Write a loop
	 * that will display each of these elements and its length.  */
	
	/**@param count: counts the loops*/
	
	public static void courseWork()
	{
		String[] classes = {"Java", "Python", "Network Concepts", "Orientation to Information Technology", "Advanced Database Management", "Information Literacy"};
		
		int element = 0;
		int characters;
		
		System.out.println("Problem 3:");
		
		for(int count = 0; count < classes.length; count++)
		{
			characters = classes[element].length();
			System.out.print(classes[element]);
			System.out.println(", " + characters);
			element = element + 1;
		}
	}
	
	
//_____________________________________________________________________________
	
	/**Problem 2: Write a method that accepts two arguments : an integer array and a 
	 * number. The method should display all the elements of an array which
	 * are lesser than a number taken as an argument.  */
	
	/**@param iterations: counts the loops
	 * @value spot: tells where in the element list*/
	
	public static void problem2(int array[], int number)
	{
		int spot = 0;
		
		System.out.println(" ");
		System.out.println("Problem 2:");
		
		for(int iterations = 0; iterations < array.length; iterations++)
		{
			if(array[spot] < number)
			{
			System.out.println(array[spot]);
			spot = spot + 1;
			}
		}
	}
	
//_____________________________________________________________________________
	
	/**Problem 4: Write a program that calculates and displays the total,
	 * average, highest and lowest value of the given data that is stored
	 * in an int or a double array. You must pass your array as an argument
	 * to the methods which would do the above mentioned tasks.    */
	
	/**@param arrayDub: takes an array of doubles
	 * @return total: gives sum
	 * @return avg: gives average
	 * @value place: gives place in the array
	 * @value stop: tells which element in the list to use
	 * @param index: counts loops
	 * @return max: gives max value
	 * @return min: gives min value
	 * @return second: returns second highest value
	 * @return third: returns third highest value
	 * @return fourth: returns fourth highest value */
	
	public static double problem4(double arrayDub[])
	{
		
		double total = 0.0;
		int place = 0;
		
		//total
		for(int index = 0; index < arrayDub.length; index++)
			total = total + arrayDub[place];
			place = place + 1;
			return total;
	}
	
	public static double Av4(double arrayDub[])
	{
		//average
		double avg;
		avg = (problem4(arrayDub))/arrayDub.length;
		return avg;
	}
	
	public static double highest(double arrayDub[])
	{
		double max = arrayDub[0];
		int stop = 0;
		
		//highest
		for(int index = 0; index < arrayDub.length; index++)
			if(max > arrayDub[stop])
			{
				stop = stop + 1;
			}
			else
			{
				max = arrayDub[stop];
				stop = stop + 1;
			}
		return max;
	}
	
	public static double lowest(double arrayDub[])
	{
		double min = arrayDub[0];
		int stop = 0;
		
		//lowest
		for(int index = 0; index < arrayDub.length; index++)
			if(min < arrayDub[stop])
			{
				stop = stop + 1;
			}
			else
			{
				min = arrayDub[stop];
				stop = stop + 1;
			}
		return min;
	}
	
	//_____________________________________________________________________________
	
	/**Bonus: Sort the given data in ascending or descend order for the given
	 * array in Problem 4.*/
	
	//returns the second highest value
	public static double midhigh(double arrayDub[])
	{
		double second = arrayDub[0];
		int stop = 0;
		double max = highest(arrayDub);
		double min = lowest(arrayDub);
		
		//second highest
		for(int index = 0; index < arrayDub.length; index++)
			if(second == max || second == min)
			{
				second = arrayDub[(stop+1)];
				stop = stop + 1;
			}
			else
			{
				if(second < arrayDub[stop])
				{
					if(arrayDub[stop] != max && arrayDub[stop] != min)
					{
						second = arrayDub[(stop)];
						stop = stop + 1;
					}
					else
					{
						stop = stop + 1;
					}
				}
				else
				{
					stop = stop + 1;
				}	
			}
		return second;
	}
	
	
	//returns the third highest value
		public static double mid(double arrayDub[])
		{
			double third = arrayDub[0];
			int stop = 0;
			double max = highest(arrayDub);
			double min = lowest(arrayDub);
			double second = midhigh(arrayDub);
			
			//third highest
			for(int index = 0; index < arrayDub.length; index++)
				if(third == max || third == min || third == second)
				{
					third = arrayDub[(stop+1)];
					stop = stop + 1;
				}
				else
				{
					if(third < arrayDub[stop])
					{
						if(arrayDub[stop] != max && arrayDub[stop] != min && arrayDub[stop] != second)
						{
							third = arrayDub[(stop)];
							stop = stop + 1;
						}
						else
						{
							stop = stop + 1;
						}
					}
					else
					{
						stop = stop + 1;
					}	
				}
			return third;
		}
	
		
		//returns the second lowest value
				public static double low(double arrayDub[])
				{
					double fourth = arrayDub[0];
					int stop = 0;
					double max = highest(arrayDub);
					double min = lowest(arrayDub);
					double second = midhigh(arrayDub);
					double third = mid(arrayDub);
					
					//third highest
					for(int index = 0; index < arrayDub.length; index++)
						if(fourth == max || fourth == min || fourth == second || fourth == third)
						{
							fourth = arrayDub[(stop+1)];
							stop = stop + 1;
						}
						else
						{
							if(fourth < arrayDub[stop])
							{
								if(arrayDub[stop] != max && arrayDub[stop] != min && arrayDub[stop] != second && arrayDub[stop] != third)
								{
									fourth = arrayDub[(stop)];
									stop = stop + 1;
								}
								else
								{
									stop = stop + 1;
								}
							}
							else
							{
								stop = stop + 1;
							}	
						}
					return fourth;
				}
}