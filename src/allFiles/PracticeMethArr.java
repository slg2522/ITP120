package allFiles;

/**Practice Methods & Arrays Problems for Exam 2
 * 
 * @author Sabrina Groves
 * @version 2.0
 * @since 3/13/2021
 */
//import java.util.Arrays;
import java.util.*;

public class PracticeMethArr
{
  //opens scanner
  private static Scanner scan = new Scanner(System.in);
  
	public static void main(String[] args)
	{
		
		/**KINETIC ENERGY CALL*/
		//program purpose
		System.out.println("This program takes in an object's mass and velocity, and outputs its kinetic energy. ");
		
		//takes variable input
		System.out.println("Enter the object's mass:  ");
		double m = scan.nextDouble();
		System.out.println("Enter the object's velocity:  ");
		double v = scan.nextDouble();
		double ke = kineticEnergy(m, v);
		
		//formats kinetic energy with comma and 2 decimal places
		System.out.print("The object's kinetic energy is ");
		System.out.printf("%,.2f", ke);
		System.out.println(" joules.");
		
		//separate the problems
		System.out.println("");
		//_____________________________________
		
		/**EXTRASENSORY PERCEPTION CALL*/
		//Average Correct
		Double accuracy = guessAccuracy();
		System.out.println("The accuracy of your guesses is: " + accuracy + "%.");
		
		//separate the problems
		System.out.println("");
		//_____________________________________
		
		/**RAINFALL CALL*/
		//List of rain by month
		double[] rainarray = new double[12];
		rainarray = RainFall.monthlyRain();
		System.out.println("The monthly rainfall is as follows: " + Arrays.toString(rainarray));
		
		//total rainfall in a year
		double yearlyRain = RainFall.totalRain(rainarray);
		System.out.print("The yearly total rainfall is: ");
		System.out.printf("%,.2f", yearlyRain);
		System.out.println(" units.");
		
		//average monthly rainfall
		double average = RainFall.averageRain(yearlyRain);
		System.out.print("The average monthly rainfall is: ");
		System.out.printf("%,.2f", average);
		System.out.println(" units.");
		
		//max monthly rainfall
		double max = RainFall.mostRain(rainarray);
		String highMonth = RainFall.maxMonth(rainarray, max);
		System.out.print("The maximum rainfall was ");
		System.out.printf("%,.2f", max);
		System.out.println(" units, and occurred in " + highMonth + ".");
		
		//min monthly rainfall
		double min = RainFall.leastRain(rainarray);
		String lowMonth = RainFall.minMonth(rainarray, min);
		System.out.print("The minimum rainfall was ");
		System.out.printf("%,.2f", min);
		System.out.println(" units, and occurred in " + lowMonth + ".");
		
		//separate the problems
		System.out.println("");
		//_____________________________________
		
		/**GREATER THAN CALL*/
		ArrayList<Integer> greaterarray = new ArrayList<Integer>();
		greaterarray = GreaterThan.whosGreater();
		System.out.println("The numbers greater than your integer are: " + greaterarray);
		
		//separate the problems
		System.out.println("");
		//_____________________________________
		
		/**STOCK SALE CALL*/
		double money = stockProfits.stockOutcome();
		String gainorloss = stockProfits.gainLoss(money);
		System.out.print("Your capital " + gainorloss + " were $");
		System.out.printf("%,.2f", money);
		System.out.println(".");
		
		//separate the problems
		System.out.println("");
		//_____________________________________
		
		//closes scanner
		scan.close();
	}
	
	//___________________________________________________________________________
	
	/**In physics, an object that is in motion is said to have
	 * kinetic energy. The following formula can be used to
	 * determine a moving object's kinetic energy:
	 * KE = 1/2 mv^2
	 * where KE = kinetic energy
	 * m = object mass (kilograms)
	 * v = velocity (m/s)
	 * 
	 * Write a method named kineticEnergy that accepts an
	 * object's mass (in kilograms) and velocity (in meters
	 * per second) as arguments. The method should return the
	 * amount of kinetic energy that the object has.
	 * Demonstrate the method by calling it in a program that
	 * asks the user to enter values for mass and velocity.*/
	
	//@param takes mass and velocity as inputs (double)
	public static double kineticEnergy(double mass, double velocity)
	{
		//squares the velocity
		double velsquare = Math.pow(velocity, 2);
		
		//computes kinetic energy
		double kenergy = 0.5 * mass * velsquare;
		
		//@return kinetic energy
		return kenergy;
	}
	
	//___________________________________________________________________________	
	
	/**Write a program that tests your ESP (extrasensory perception).
	 * The program should randomly select the name of a color from the
	 * following list of words:
	 *      Red, Green, Blue, Orange, Yellow
	 * To select a word, the program can generate a random number. For
	 * example, if the number is 0, the selected word is Red; if the
	 * number is 1, the selected word is Green; and so forth.
	 * 
	 *  Next, the program should ask the user to enter the color that
	 *  the computer has selected. After the user has entered the guess,
	 *  the program should display the name of the randomly selected color.
	 *  The program should repeat this 10 times and then display the
	 *  number of times the user correctly guessed the selected color.
	 *  Be sure to modularize the program into methods that perform each task.*/
	
	//takes the user's color input
	public static String pickColor()
	{	
		//take string color input from the user
		System.out.println("Pick a color from the list (red, green, blue, orange, yellow): ");
		String userColor = scan.next();
		
		//@return user's color choice
		return userColor;
	}
	
	//computer generates a random color
	public static String randColor()
	{
		//generate a random number
		double randomNumber = Math.random();
		
		//raise the range to between 0 and 4 (the elements of the array)
		randomNumber = randomNumber * 4;
		
		//casts the random number to an integer
		int randomInteger = (int) randomNumber;
		
		//uses the random integer to select an element from a list
		//@return corresponding color as a string
		String randomColor[] = {"Red", "Green", "Blue", "Orange", "Yellow"};
		String compColor = "blank";
		switch(randomInteger)
		{
		case 0:
			compColor = randomColor[0];
			break;
		case 1:
			compColor = randomColor[1];
			break;
		case 2:
			compColor = randomColor[2];
			break;
		case 3:
			compColor = randomColor[3];
			break;
		case 4:
			compColor = randomColor[4];
			break;
		}
      	return compColor;
	}
	
	//compares the user guess to the computer color 10 times & computes accuracy
	public static double guessAccuracy()
	{
		//to loop 10 times
		double repetitions = 10;
		
		//accumulator and array declaration
      	double tally=0;
		String[] userColorList = new String[10];
		String[] computerColorList = new String[10];
      	
      	//test returns 1.0
      	//String[] userColorList = {"red", "red", "red", "red", "red", "red", "red", "red", "red", "red"};
      	//String[] computerColorList = {"red", "red", "red", "red", "red", "red", "red", "red", "red", "red"};
      
		for(int index = 0; index < repetitions; index++)
		{
			//define arrays to hold colors
			userColorList[index] = pickColor();
			//check what's being added
			//System.out.println(userColorList[index]);
			computerColorList[index] = randColor();
			//check what's being added
			//System.out.println(computerColorList[index]);
          	
			//compare individual colors
			String userColor = userColorList[index];
          	String computerColor = computerColorList[index];
          	
          	//if they match, award a point
          	if (userColor.equalsIgnoreCase(computerColor))
          	{
          		tally += 1;
          		//check status
          		System.out.println("Match!");
          	}
          	else
          	{
          			//check status
          			System.out.println("No match.");
          	}
		}
		//check that these are working
		//System.out.println("Tally:" + tally);
        //System.out.println("Repetitions:" + repetitions);
		
        //get average correct
        double average = (tally/repetitions) * 100;
		
        //@return average correct color guesses as a percent
		return average;
	}
	
	//___________________________________________________________________________
	
	/**Write a RainFall class that stores the total rainfall for each of 12 months
	 * into an array of doubles. The program should have methods that return the
	 * following:
	 * 		-the total rainfall for the year
	 * 		-the average monthly rainfall
	 * 		-the month with the most rain
	 * 		-the month with the least rain
	 * Demonstrate the class in a complete program.
	 * Input Validation: Do not accept negative numbers for monthly rainfall figures.*/
	
	//declares new class for rainfall
	static class RainFall
	{
		//open new scanner for RainFall class
		private static Scanner rainscan = new Scanner (System.in);     //WHERE DO I CLOSE THIS????????????????????????????
		
		//method takes monthly input from the user
		public static double[] monthlyRain()
		{
		System.out.println("This program takes the monthly rainfall for the most recent year. Please enter the rainfall for");
		
		//12 months in year shouldn't change
		final int months = 12;
		
		//new array to hold rainfall by month
		double[] rainlist = new double[12];
		
		//loop to take input from user one month at a time
		for(int index = 0; index < months; index++)
		{
			System.out.println("Month " + (index+1) + ":  ");
			rainlist[index] = rainscan.nextDouble();
			
			//don't allow inputs less than zero
			if (rainlist[index] >= 0)
			{
				System.out.println("Thank you for your input.");
			}
			else
			{
				System.out.println("Rainfall must be above 0 units. Enter a valid rainfall:  ");
				rainlist[index] = rainscan.nextDouble();
			}
		}
		//@return rainlist: array list of rainfall by month
		return rainlist;
		}
		
		//method finds total rainfall in one year
		//@param rainlist: takes array of rainfall for 12 months
		public static double totalRain(double[] rainlist)
		{
			//accumulator
			double total = 0;
			
			//adds one month at a time to total
			for(int index = 0; index < rainlist.length; index++)
			{
				total = total + rainlist[index];
			}
		//@return total: gives total yearly rainfall
		return total;
		}
		
		//method finds the average monthly rainfall
		//@param total: takes total yearly rainfall
		public static double averageRain(double total)
		{
			final int monthsinyear = 12;
			double avgrain = total/monthsinyear;
			
			//@return avgrain: gives average monthly rainfall
			return avgrain;
		}
		
		//method finds max rain in a month
		public static double mostRain(double[] rainlist)
		{
			//sorts from lowest to highest
			Arrays.sort(rainlist);
			return rainlist[rainlist.length - 1];
		}
		
		//method finds month with most rain
		public static String maxMonth(double[] rainlist, double maximum)
		{
			//sorts rainlist[] and finds max rain
			Arrays.sort(rainlist);
			double max = rainlist[(rainlist.length - 1)];
			
			//defines month outside the loop
			String month = "none";
			
			//matches max rain to max rain in month order
			for(int index = 0; index < rainlist.length; index++)
			{
				if(max == rainlist[index])
				{
					int monthNum = index;
					switch(monthNum)
					{
					case 0:
						month = "January";
						break;
					case 1:
						month = "February";
						break;
					case 2:
						month = "March";
						break;
					case 3:
						month = "April";
						break;
					case 4:
						month = "May";
						break;
					case 5:
						month = "June";
						break;
					case 6:
						month = "July";
						break;
					case 7:
						month = "August";
						break;
					case 8:
						month = "September";
						break;
					case 9:
						month = "October";
						break;
					case 10:
						month = "November";
						break;
					case 11:
						month = "December";
						break;
					}
				}
			}
			//@return month: gives month, as string, with highest rainfall
			return month;
		}
		
				//method finds min rain in a month
				public static double leastRain(double[] rainlist)
				{
					Arrays.sort(rainlist);
					return rainlist[0];
				}
				
				//method finds month with most rain
				public static String minMonth(double[] rainlist, double minimum)
				{
					//sorts rainlist[] and finds max rain
					Arrays.sort(rainlist);
					double min = rainlist[0];
					
					//defines month outside the loop
					String month = "none";
					
					//matches max rain to max rain in month order
					for(int index = 0; index < rainlist.length; index++)
					{
						if(min == rainlist[index])
						{
							int monthNum = index;
							switch(monthNum)
							{
							case 0:
								month = "January";
								break;
							case 1:
								month = "February";
								break;
							case 2:
								month = "March";
								break;
							case 3:
								month = "April";
								break;
							case 4:
								month = "May";
								break;
							case 5:
								month = "June";
								break;
							case 6:
								month = "July";
								break;
							case 7:
								month = "August";
								break;
							case 8:
								month = "September";
								break;
							case 9:
								month = "October";
								break;
							case 10:
								month = "November";
								break;
							case 11:
								month = "December";
								break;
							}
						}
					}
					//@return month: gives string for low rainfall month
					return month;
				}
	}
	
	//___________________________________________________________________________
	
		/**In a program, write a method that accepts two arguments: an array and a number n.
		 * Assume that the array contains integers. The method should display all of the
		 * numbers in the array that are greater than the number n.*/
	
	//Creates a class to compare an array and number to see which is greater
	static class GreaterThan
	{
		//Creates a scanner
		private static Scanner greaterscan = new Scanner (System.in);
		
		public static ArrayList<Integer> whosGreater()
		{
			//declares an ArrayList with indeterminate length (not possible in an array)
			ArrayList<Integer> arrayofintegers = new ArrayList<Integer>();
			
			//takes an integer from the user
			System.out.println("Enter a single integer:  ");
			int userintegerinput = greaterscan.nextInt();
			
			//sets up variables to continue if yes
			String input;
			String y = "yes";
			
			//do while loop to fill the array with user input (continues while "yes")
			do
			{
				//fills the array
				System.out.println("Enter an integer to fill the array:  ");
				arrayofintegers.add(greaterscan.nextInt());
				
				//continue filling or stop
				System.out.println("Would you like to enter another integer?");
				input = scan.next();
			}
			while(input.equalsIgnoreCase(y));
			
			//finds size of the ArrayList
			int size = arrayofintegers.size();
			
			//create an array to hold greater numbers
			ArrayList<Integer> greaternumbers = new ArrayList<Integer>();
			
			//check which arraylist numbers are greater than the single integer and adds them to a new arraylist
			for(int count = 0; count < size; count++)
			{
				if(arrayofintegers.get(count) > userintegerinput)
				{
					greaternumbers.add(arrayofintegers.get(count));
				}
			}
			//@return greaternumbers: gives arraylist of numbers in array greater than the user's integer
			return greaternumbers;	
		}
	}
		
		//___________________________________________________________________________
		
		/**The profit from the sale of a stock can be calculated as follows:
		 * 			Profit=((NS * SP)-SC) - ((NS * PP) + PC)
		 * where NS is the number of shares, PP is the purchase price per share, PC is the
		 * per-share commission paid, SP is the sale price per share, and SC is the sale
		 * commission paid. If the calculation yields a positive value, then the
		 * sale of the stock resulted in a profit. If the calculation yields a negative
		 * number, then the sale resulted in a loss.
		 * 
		 * Write a method that accepts, as arguments, the number of shares, the purchase price
		 * per share, the purchase commission paid, the sale per share, the sale commission
		 * paid. The method should return the profit (or loss) from the sale of the stock.
		 * Demonstrate the method in a program that asks the user to enter the necessary data
		 * and displays the amount of the profit or loss.*/
	
	//creates a class to handle stock sales
	static class stockProfits
	{
		//creates a scanner
		private static Scanner stockscan = new Scanner(System.in);
		
		//method to determine profit or loss
		public static double stockOutcome()
		{
			//get number of shares
			System.out.println("How many stock shares did you have? ");
			double NS = stockscan.nextDouble();
			
			//get purchase price per share
			System.out.println("What was the purchase price per share? ");
			double PP = stockscan.nextDouble();
			
			//get per-share commission paid
			System.out.println("What did you pay in per-share commission? ");
			double PC = stockscan.nextDouble();
			
			//get sale price per share
			System.out.println("What was the sale price per share? ");
			double SP = stockscan.nextDouble();
			
			//get sale commission paid
			System.out.println("How much did you pay in sales commission? ");
			double SC = stockscan.nextDouble();
			
			//declares and sets gains/losses equal to formula
			double stockresult = ((NS * SP) - SC) - ((NS * PP) + PC);
			
			//@return stockresult: gives money gained/lost from the market
			return stockresult;
		}
		
		//method to determine gain, neutral, or loss
		//@param stockresult: takes monetary outcome from the market
		public static String gainLoss(double stockresult)
		{
			//creates variable to hold gain/loss
			String result;
			
			//determines if gain or loss from market
			if(stockresult >= 0)
			{
				result = "gains";
			}
			else
			{
				result = "losses";
			}
		
		//@return result: gives string gain or loss
		return result;
		}
	}
}
