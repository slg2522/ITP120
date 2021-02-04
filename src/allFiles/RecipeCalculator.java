package allFiles;

import java.util.Scanner;

public class RecipeCalculator
{
	public static void main(String[] args)
	{
		/*Recipe Calculator : A cookie recipe calls for 2.75 cups of flour, 1 cup of butter,
		1.5 cups of sugar for 48 cookies. Write a program using switch case to ask the user how
		many cookies s/he would want to make and then display the ingredients for that.
		Limit the choice to multiples of 12.  */
		
		//creates a new scanner named scanner1
		Scanner scanner1 = new Scanner(System.in);
		
		//for 48 cookies recipe (units: dozen cookies, rest cups)
		int oneDozen = 12;
		int cookieRecipe = 48;
		int cookies3Dozen = (cookieRecipe/oneDozen);
		double flour = 2.75;
		double butter = 1.00;
		double sugar = 1.50;
		
		//gets cookie amount from the user
		System.out.println("How many dozen cookies do you want? (A dozen is 12 cookies) ");
		int dozens = Integer.parseInt(scanner1.nextLine());
		
		//for 48 cookies recipe (units: cups)
		double flourNeed = (flour/cookies3Dozen)*dozens;
		double butterNeed = (butter/cookies3Dozen)*dozens;
		double sugarNeed = (sugar/cookies3Dozen)*dozens;
		
		//determines which ingredients are needed using switch case
		int cookies = dozens;
		String ingredients;
		switch(cookies)
		{
			case 0: ingredients = ("Really, you don't want any cookies? Ok, suit yourself.");
				break;
			case 1: ingredients = ("For 1 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 2: ingredients = ("For 2 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 3: ingredients = ("For 3 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 4: ingredients = ("For 4 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 5: ingredients = ("For 5 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 6: ingredients = ("For 6 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 7: ingredients = ("For 7 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 8: ingredients = ("For 8 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 9: ingredients = ("For 9 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 10: ingredients = ("For 10 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 11: ingredients = ("For 11 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			case 12: ingredients = ("For 12 Dozen Cookies: " + flourNeed + " cups of flour, " + butterNeed + " cups of butter, " + sugarNeed + " cups of sugar");
				break;
			default : ingredients = "Too many cookies!!";
		}
		
		//prints the necessary ingredients
		System.out.println(ingredients);
		
		//closes scanner1
		scanner1.close();
	}
}

