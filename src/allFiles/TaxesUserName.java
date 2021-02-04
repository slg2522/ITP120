package allFiles;

import java.util.Scanner;
import java.util.Date;

public class TaxesUserName
{
	public static void main(String[] args)
	{
		/*Write a program that displays the following output with mentioned formatting:
		 *"User Name with a field 25 spaces wide" earns "Currency and amount in floating point
		 *with 2 digit accuracy after decimal" and paid taxes in the amount of "22% of the salary,
		 *with comma separated floating value with 2 decimal point accuracy" on "current date".  */
	
	//creates a new scanner named scanner2
	Scanner scanner2 = new Scanner(System.in);
	
	//intakes user name input from the user
	System.out.println("Enter your User Name: ");
	String UserName = scanner2.nextLine();
	
	//intakes currency and amount
	System.out.println("Enter your annual salary: ");
	double salary = Double.parseDouble(scanner2.nextLine());
	
	//calculates tax as 22% of the salary
	double tax = (salary*.22);
	
	//retrieves the current date under variable todayDate
	Date todayDate = new Date();
	
	//System.out.println(UserName + " earns " + salary + " and paid taxes in the amount of " + tax + " on " + todayDate + ".");
	
	//print statement. see formatting on: https://www.baeldung.com/java-printstream-printf
	System.out.printf("%25s", UserName);
	System.out.print(" earns $");
	System.out.printf("%,.2f", salary);
	System.out.print(" and paid taxes in the amount of $");
	System.out.printf("%,.2f", tax);
	System.out.print(" on ");
	System.out.printf("%1$td.%1$tm.%1$ty %n", todayDate);
	
	//closes scanner2
	scanner2.close();
	}
}