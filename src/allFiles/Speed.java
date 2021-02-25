package allFiles;

//Display the speed is not within the range when the variable speed is outside the range of 0 and 75.

import javax.swing.JOptionPane;

public class Speed
{
	public static void main(String[] args)
	{
		int speed;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your speed");
		speed = Integer.parseInt(input);
		
				if (speed < 0)
				{
					JOptionPane.showMessageDialog(null,  "speed is not within the range");
				}
				else
				{
					if (speed < 75)
					{
						JOptionPane.showMessageDialog(null,  "speed is in the range");
					}
							else
							{
								JOptionPane.showMessageDialog(null, "Your grade is A.");
							}
				
System.exit(0);
					
	}
	}
}