package allFiles;
import javax.swing.JOptionPane;

public class CityCountry
{
		public static void main(String[] args)

		/**Write a program that ask user to enter the name of his or her two favorite cities and their corresponding countries. */
		/**Store those inputs as String variables.You  would take the input from the users using dialog box or keyboard input.*/
		/**Display the following using printf or StringFormat:*/
		//Number of characters in the names of the cities 
		//The names of the countries in Uppercase
		//The names of the cities in Lowercase
		//The first character in the name of the city 
		//Larger of the city names 
		//Tell user if the two cities belong to the same country or not.
			{
				String city1 = JOptionPane.showInputDialog("What is the name of your favorite city?");
				String country1 = JOptionPane.showInputDialog("Which country is your favorite city located in?");
				String city2 = JOptionPane.showInputDialog("What is the name of your second favorite city?");
				String country2 = JOptionPane.showInputDialog("Which country does the second city reside in?");
			
				//stores number of characters in each city
				int letters1 = city1.length();
				int letters2 = city2.length();
			
				//ignore: Just to check: System.out.println(letters1);
				
				//prints character comparison by city
				JOptionPane.showMessageDialog(null, "There are " + letters1 + " characters in " + city1 + ".\nThere are " + letters2 + " characters in " + city2 + ".");
			
				//countries in uppercase
				System.out.println("Countries in uppercase:");
				System.out.printf("%S %n", country1);
				System.out.printf("%S %n", country2);
				
				//cities in lowercase
				System.out.println("Cities in lowercase:");
				city1 = city1.toLowerCase();
				System.out.println(city1);
				city2 = city2.toLowerCase();
				System.out.println(city2);
				
				//the first character in the name of the city
				System.out.println("First letter in city1:");
				System.out.print((String.format("%.1s %n", city1)));
				System.out.println("First letter in city2:");
				System.out.print((String.format("%.1s %n", city2)));
				
				//stores number of characters in each city
				letters1 = city1.length();
				letters2 = city2.length();
				
				//larger of the city names simple
				System.out.println("Which city has more characters?");
				if(letters1 > letters2)
				{
					System.out.println(city1 + " has more characters than " + city2 + ".");
					if(letters1 == letters2)
					{
						System.out.println(city1 + " has the same number of characters as " + city2 + ".");
					}
						if(letters1 == letters2)
						{
							System.out.println(city1 + " has less characters than " + city2 + ".");
						}
				}
				
				//are the countries the same?
				System.out.println("Are both cities in the same country?");
				if(country1.equalsIgnoreCase(country2))
				{
					System.out.println(city1 + " is in the same country as " + city2 + ". Both are in " + country1 + ".");
				}
					else
					{
						System.out.println(city1 + " is not in the same country as " + city2 + "." + city1 + " is in " + country1 + " and " + city2 + " is in " + country2 + ".");
					}
				
			System.exit(0);
			}

}
