package allFiles;

/** The following code is used to solve problems in the Methods_2 homework */

//import statements
import java.util.Scanner;

public class Methods_2
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //area calculation
        double width = shapeWidth(scan);
        double length = shapeLength(scan);
        double area = shapeArea(width, length);
        System.out.println("The area is " + area + " square units.");

        //return gallons of paint, hours of labor, and cost of labor
        int rooms = inputRooms(scan);
        double gallons = gallonsPaint(rooms);
        double hours = hoursLabor(rooms);
        double money = moneyLabor(hours, rooms);
        System.out.println("For your " + rooms + "-room project, you will need: " + gallons + " gallons of paint, " + hours + " hours of labor, and $" + money + " to pay for labor.");

        //return letter grade and average
        double average = calcAverage(scan);
        System.out.println("Your average grade is: " + average);
        determineGrade(scan);

        //unitConverter()
        double meters = unitMeters(scan);
        char choice = unitChoice(scan);
        unitConverter(choice, meters);

        //number generator
        int number1 = numberGenerator();
        oddEven(number1);

    }

//______________________________________________________________________________________________________________________________________

    /**Ask user to enter width and length for the rectangle and calculate the area based on the input values and display*/

    //insert width
    public static double shapeWidth(Scanner scan)
    {
        double width;

        System.out.println("Enter a rectangle width: ");
        width = scan.nextDouble();

        return width;
    }

    //insert length
    public static double shapeLength(Scanner scan)
    {
        double length;

        System.out.println("Enter a rectangle length: ");
        length = scan.nextDouble();

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
    public static int inputRooms(Scanner scan)
    {
        int rooms;
        System.out.println("How many rooms will you paint? Assume each room is 115 square feet. ");
        rooms = scan.nextInt();

        return rooms;
    }

    //calculate gallons of paint
    public static double gallonsPaint(int rooms)
    {
        double gallons = rooms * 1;
        return gallons;
    }

    //calculate labor required in hours
    public static double hoursLabor(int rooms)
    {
        double hours = rooms * 8;
        return hours;
    }

    //calculate labor cost
    public static double moneyLabor(double hours, double rooms)
    {
        double money = rooms * hours;
        return money;
    }

//______________________________________________________________________________________________________________________________________

    /** function to determine letter grades and average */
    //the average test score (calcAverage)
    public static double calcAverage(Scanner scan)
    {
        double grades;
        double total = 0;
        double average;

        //takes in 5 numeric grades from the user
        for (int repeat = 1; repeat <= 5; repeat++)
        {
            //String grades;
            System.out.println("Enter a numeric grade: ");
            grades = scan.nextDouble();

            total += grades;
        }
        average = total / 5;
        return average;
    }

    //display a letter grade for each score (determineGrade)
    public static void determineGrade(Scanner scan)
    {
        System.out.println("Enter a numeric grade:  ");
        int numGrade = scan.nextInt();

        // A Grade
        if (numGrade >= 90 && numGrade <= 100) {
            System.out.println("Your grade is: A");
        }
        // B Grade
        else if (numGrade >= 80 && numGrade < 90) {
            System.out.println("Your grade is: B");
        }
        // C Grade
        else if (numGrade >= 70 && numGrade < 80) {
            System.out.println("Your grade is: C");
        }
        // D Grade
        else if (numGrade >= 60 && numGrade < 70) {
            System.out.println("Your grade is: D");
        }
        // F Grade
        else if (numGrade < 60 && numGrade >= 0) {
            System.out.println("Your grade is: F");
        }
        // N/A Grade
        else {
            System.out.println("N/A");
        }

    }
//______________________________________________________________________________________________________________________________________

    /**Measurement conversion from meters*/
    public static double unitMeters(Scanner scan)
    {
        //user enter distance (meters)
        System.out.println("Enter a distance in meters: ");
        double meters = scan.nextDouble();

        return meters;
    }

    public static char unitChoice(Scanner scan)
    {
        //ask user what they want to convert into (inches, feet, kilometers, miles, and yard
        System.out.println("What would you like to convert to?");
        System.out.println("a.inches");
        System.out.println("b.feet");
        System.out.println("c.kilometers");
        System.out.println("d.miles");
        System.out.println("e.yards");
        scan.nextLine(); // advance scanner past newlines
        String convert = scan.nextLine();
        char choice = convert.charAt(0);
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
