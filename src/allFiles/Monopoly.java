package allFiles;

/**Define a function called monopolyRoll(). This function provides a random result based on the dice-rolling rules for the board game Monopoly.
 * In Monopoly, players roll two six-sided dice to determine their move. If they roll the same value on both dice, this is called “rolling doubles,”
 * and it means they go again. In our simplified version, the dice-roll function should behave like this:
			1. Generate two random integers in the 1 to 6 range.
			2. If the numbers are not the same, return the sum.
			3. If the numbers are the same, generate two more random integers in the 1 to 6 range, and return the sum of all 4 numbers. */


public class Monopoly
{
	public static void main(String[] args)
	{
		//provides random integers for the variables
		int roll1 = rollDice();
		int roll2 = rollDice();
		
		int roll3 = monopolyRoll3(roll1, roll2);
		int roll4 = monopolyRoll4(roll1, roll2);
		
		
		//calculates the sum of the rolls
		int sum = roll1 + roll2 + roll3 + roll4;
		
		//prints the result
		System.out.println("First Roll: " + roll1);
		System.out.println("Second Roll: " + roll2);
		System.out.println("Third Roll: " + roll3);
		System.out.println("Fourth Roll: " + roll4);
		System.out.println("The sum of your rolls is:  " + sum + ".");
	}
		
		public static int rollDice()
		{
			//aquires a random number between 0 and (almost) 1
			double randomNumber = Math.random();
			
			//raises the range of the random number to between 0 and (almost) 6
			randomNumber = randomNumber * 6;
			
			//shifts the range up by 1
			randomNumber = randomNumber + 1;
			
			//cast to integer to ignore the decimal
			int randomInteger = (int) randomNumber;
			
			return randomInteger;
		}
		
		
			public static int monopolyRoll3(int roll1, int roll2)
			{
				//if the first two rolls are the same, roll again
				if (roll1 == roll2)
				{
					int roll3 = rollDice();
					return roll3;
					
				}
				//if the first two rolls are not the same, stop
				else
				{
					int roll3 = 0;
					return roll3;
				}
			}
			
			public static int monopolyRoll4(int roll1, int roll2)
			{
				//if the first two rolls are the same, roll again
					if (roll1 == roll2)
					{
						int roll4 = rollDice();
						return roll4;
					}
					//if the first two rolls are not the same, stop
					else
					{
						int roll4 = 0;
						return roll4;
					}
			}
}
