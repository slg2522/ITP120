package allFiles;
/**
 * Program to compare 2 String objects using the equals method.
 * @author sabrina
 *
 */

public class CompareStrings
{
	public static void main(String[] args)
	{
		String name1 = "Mark";
		String name2 = "Mark";
		String name3 = "Mary";
		
		//Compare name1 and name2
		if (name1.equals(name2))
		{
			System.out.println(name1 + " and " + name2 + " are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name2 + " are not equal.");
		}
		
		//Compare name1 and name3
		if (name1.equals(name3))
		{
			System.out.println(name1 + " is equal to " + name3 + ".");
		}
		else
		{
			System.out.println(name1 + " and " + name3 + " are not equal.");
		}
		
		//Using the compareTo method
		if (name1.compareTo(name2) < 0)
		{
			System.out.println(name1 + " is less than " + name2);
		}
		else if (name1.compareTo(name2) == 0)
		{
			System.out.println(name1 + " is equal to " + name2);
		}
		else if (name1.compareTo(name2) > 0)
		{
			System.out.println(name1 + " is greater than " + name2);
		}
		
		//To ignore case
		//variableName.equalsIgnoreCase("EnterWordToMatchTo")
		
		//Example:
		String input = "Example";
		if(input.equalsIgnoreCase("Hello"))
		{
			System.out.println("They match!");
		}
		else
		{
			System.out.println("No match.");
		}
	}
}
