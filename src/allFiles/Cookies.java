package allFiles;

import java.util.Scanner;

/**This program provides the number of calories, given a certain starting number of cookies. */

public class Cookies
{
	public static void main(String[] args)
	{
		//Number of cookies per bag
		int bag = 40;
		
		//Servings per bag
		int serving = 10;
		
		//Calories per serving
		int caloriesI = 300;
		
		//Cookies per serving = 40 cookies/10 servings per bag = 4 cookies per serving initial
		int CookieServing = bag/serving;
		
		//Calculates the number of calories for one cookie
		int cookie1 = caloriesI / CookieServing;
		
		int consume;
		
		Scanner cookieScanner = new Scanner(System.in);
		
		System.out.println("How many cookies do you plan to consume?");
		consume = Integer.parseInt(cookieScanner.nextLine());
		
		int caloriesF = consume * cookie1;
		
		System.out.println("For " + consume + " cookies, you will gain " + caloriesF + " calories.");
		
cookieScanner.close();	
	}
}
