package allFiles;

/**Practice Methods & Arrays Problems for Exam 2
 * 
 * @author Sabrina Groves
 * @version 1.0
 * @since 3/12/2021
 */

import java.util.Scanner;

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
		
		//_____________________________________
		
		/**EXTRASENSORY PERCEPTION CALL*/
		//Average Correct
		//String userColor = pickColor();
		//String randomColor = randColor();
		Double accuracy = guessAccuracy();
		System.out.println("The accuracy of your guesses is: " + accuracy + "%.");
		
		//_____________________________________
		
		/**RAINFALL CALL*/
		
		
		//_____________________________________
		
		/**GREATER THAN CALL*/
		
		
		//_____________________________________
		
		/**STOCK SALE CALL*/
		
		
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
      	return compColor;    //ERROR HERE!! When I put it here, it asks me to declare compColor??
      
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
	
	
	//___________________________________________________________________________
	
	/**In a program, write a method that accepts two arguments: an array and a number n.
	 * Assume that the array contains integers. The method should display all of the
	 * numbers in the array that are greater than the number n.*/
	
	
	//___________________________________________________________________________
	
	/**The profit from the sale of a stock can be calculated as follows:
	 * 			Profit=((NS * SP)-SC) - ((NS * PP) + PC)
	 * where NS is the number of shares, PP is the purchase price per share, PC is the
	 * purchare commission paid, SP is the sale price per share, and SC is the sale
	 * commission paid. If the calculation yields a positive value, then the
	 * sale of the stock resulted in a profit. If the calculation yields a negative
	 * number, then the sale resulted in a loss.
	 * 
	 * Write a method that accepts, as arguments, the number of shares, the purchase price
	 * per share, the purchase commission paid, the sale per share, the sale commission
	 * paid. The method should return the profit (or loss) from the sale of the stock.
	 * Demonstrate the method in a program that asks the user to enter the necessary data
	 * and displays the amount of the profit or loss.*/
	
