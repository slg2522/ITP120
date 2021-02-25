package allFiles;

/** The following code is used to solve problems in the Methods_2 homework */

//import statements
import java.util.Scanner;

public class Methods_2
{
	
	public static void main(String[] args)
	{
		Scanner scannerM = new Scanner(System.in);
		
		//area calculation
		double width = shapeWidth();
		double length = shapeLength();
		double area = shapeArea(width, length);
		System.out.println("The area is " + area + " square units.");
		
		//return gallons of paint, hours of labor, and cost of labor
		int rooms = inputRooms();
		double gallons = gallonsPaint(rooms);
		double hours = hoursLabor(rooms);
		double money = moneyLabor(hours);
		System.out.println("For your " + rooms + "-room project, you will need: " + gallons + " gallons of paint, " + hours + " hours of labor, and $" + money + " to pay for labor.");
		
		//return letter grade and average
		double average = calcAverage();
		System.out.print("Your average grade is: " + average);
		determineGrade();
		
		//unitConverter()
		double meters = unitMeters();
		char choice = unitChoice();
		unitConverter(choice, meters);
		
		//number generator
		int number1 = numberGenerator();
		oddEven(number1);
		
		scannerM.close();
	}

//______________________________________________________________________________________________________________________________________

		/**Ask user to enter width and length for the rectangle and calculate the area based on the input values and display*/
	
			//insert width
			public static double shapeWidth()
			{
				System.out.println("Enter a rectangle width: ");
				double width = Double.parseDouble(scannerM.nextLine());
				return width;
			}
			
			//insert length
			public static double shapeLength()
			{
				System.out.println("Enter a rectangle length: ");
				double length = Double.parseDouble(scannerM.nextLine());
				return length;
			}
			
			//calculate area
			public static double shapeArea(double width, double length)
			{
				double area = width * length;
				return area;
			}

//______________________________________________________________________________________________________________________________________
		
		/**function to determine paint (gallons), labor (hours), cost (dollars)*/
			//input from user for # of rooms
			public static int inputRooms()
			{
				System.out.println("How many rooms will you paint? Assume each room is 115 square feet. ");
				int rooms = Double.parseDouble(scannerM.nextLine());
				return rooms;
			}
			
			//calculate gallons of paint
			public static int gallonsPaint(int rooms)
			{
				int rooms = inputRooms();
				double gallons = rooms * 1;
				return gallons;
			}
			
			//calculate labor required in hours
			public static double hoursLabor(int rooms)
			{
				int rooms = inputRooms();
				double hours = rooms * 8;
				return hours;
			}
			
			//calculate labor cost
			public static double moneyLabor(double hours)
			{
				double hours = hoursLabor(int rooms);
				double money = rooms * hours;
				return money;
			}

//______________________________________________________________________________________________________________________________________

		/** function to determine letter grades and average */
			//the average test score (calcAverage)
			public static double calcAverage()
			{	
				double grades;
				double total = 0;
				double average;
				
				//takes in 5 numeric grades from the user
				for (int repeat = 1; repeat <= 5; repeat++)
				{
					System.out.println("Enter a numeric grade: ");
					String grades = scannerM.nextLine();
					total += grades;
				}
			average = total / 5;
			return average;
			}
			
			//display a letter grade for each score (determineGrade)
			public static void determineGrade()
			{
				System.out.println("Enter a numeric grade:  ");
				int numGrade = Integer.parseInt(scannerM.nextLine());
				
					switch(numGrade)
					{
					//A Grade
					case (numGrade >= 90 && numGrade <= 100):
						grade = A;
						System.out.println(grade);
						break;
					
					//B Grade
					case (numGrade >= 80 && numGrade < 90):
						grade = B;
						System.out.println(grade);
						break;
					
					//C Grade
					case (numGrade >= 70 && numGrade < 80):
						grade = C;
						System.out.println(grade);
						break;
					
					//D Grade
					case (numGrade >= 60 && numGrade < 70):
						grade = D;
						System.out.println(grade);
						break;
					
						//F Grade
					case (numGrade < 60 && numGrade >= 0):
						grade = F;
						System.out.println(grade);
						break;
					
					default:
						System.out.println("N/A");
					}
					System.out.println("Your grade is: " + grade);
				}
//______________________________________________________________________________________________________________________________________

		/**Measurement conversion from meters*/
		public static double unitMeters()
		{	
			//user enter distance (meters)
			System.out.println("Enter a distance in meters: ");
			double meters = Double.parseDouble(scannerM.nextLine());
			return meters;
		}
			
		public static char unitChoice()
		{
			//ask user what they want to convert into (inches, feet, kilometers, miles, and yard
			System.out.println("What would you like to convert to? \na.inches \nb.feet \nc.kilometers \nd.miles \ne.yards");
			String convert = scannerM.nextLine();
			char choice = userInput.charAt(0);
			return choice;
		}
		
		public static void unitConverter(char choice, double meters)
		{	
			switch(choice)
			{
			//meters to inches
			case 'a':
			case 'A':
				double inches = meters * 39.3701;
				System.out.println(inches + "inches");
				break;
			
			//meters to feet
			case 'b':
			case 'B':
				double feet = meters * 3.2808;
				System.out.println(feet + "feet");
				break;
			
			//meters to kilometers
			case 'c':
			case 'C':
				double kilometers = meters * 0.001;
				System.out.println(kilometers + "kilometers");
				break;
			
			//meters to miles
			case 'd':
			case 'D':
				double miles = meters * 0.0006;
				System.out.println(miles + "miles");
				break;
			
				//meters to yards
			case 'e':
			case 'E':
				double yards = meters * 1.0936;
				System.out.println(yards + "yards");
				break;
			
			default:
				System.out.println("N/A");
			}
		}

//______________________________________________________________________________________________________________________________________
		
		/**Random number generator function for 0-1000*/
		public static int numberGenerator()
		{
		//generates random number
		double randomNumber = Math.random();
		
		//raises the range to between 0 and 1000
		randomNumber = randomNumber * 1000;
		
		//casts the random number as an integer
		int randomInteger = (int) randomNumber;
		
		//returns a random integer
		return randomInteger;
		}
		
		/**Determines if number is even or odd */
		public static void oddEven(int integer)
		{
			//if number % 2 == 0, even
			if (integer % 2 == 0)
			{
				System.out.println(integer + " is even.");
			}
			else
			{
				//not even, must be odd
				System.out.println(integer + " is odd.");
			}	
		}
}
