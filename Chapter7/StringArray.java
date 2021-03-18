package allFiles;

public class StringArray
{
	public static void main(String[] args)
	{
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int index = 0; index < months.length; index++)
		{
			System.out.println("There are " + days[index] + " days in " + months[index] + ".");
		}
	}
}
