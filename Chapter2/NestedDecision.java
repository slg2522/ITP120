package allFiles;

import javax.swing.JOptionPane;

public class NestedDecision
{
	public static void main(String[] args)
	{
		/** Asks user for a test score and gives grade */
		
		int testScore;
		String input;
		
		//get score
		input = JOptionPane.showInputDialog("Enter your score:");
		testScore = Integer.parseInt(input);
		
		//display grade
		if (testScore < 60)
		{
			JOptionPane.showMessageDialog(null,  "Your grade is F.");
		}
		else
		{
			if (testScore < 70)
			{
				JOptionPane.showMessageDialog(null,  "Your grade is D.");
			}
			else
			{
				if (testScore < 80)
				{
					JOptionPane.showMessageDialog(null,  "Your grade is C.");
				}
				else
				{
					if (testScore < 90)
					{
						JOptionPane.showMessageDialog(null,  "Your grade is B.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your grade is A.");
					}
				}
			}
		}
		System.exit(0);
	}
}
