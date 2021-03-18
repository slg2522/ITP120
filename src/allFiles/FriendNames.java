package allFiles;

/**
 * Exam 2, Question 16: Take 5 friend names and display the first character of each name
 * @author Sabrina Groves
 * @since 3/15/2021
 *
 */

public class FriendNames
{
	public static void main(String[] args)
	{
		String[] friends = {"Silva", "Trevor", "Brian", "Lisa", "Janie"};
		
		//index start
		int index = 0;
		
		//first character
		char first;
		
		//loop to go through each element and grab first character
		for(index = 0; index < friends.length; index++)
		{
			first = friends[index].charAt(0);
			System.out.println(first);
		}
	}
}
