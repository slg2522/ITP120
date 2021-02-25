package allFiles;

import javax.swing.JOptionPane;

public class ElseIf
{
	public static void main(String[] args)
	{
		/**Takes a score from the user and assigns a grade.*/
		
		int testScore;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your score:");
		testScore = Integer.parseInt(input);
		
		//Display grade
		if (testScore < 60)
			JOptionPane.showMessageDialog(null,  "F");
		else if (testScore < 70)
			JOptionPane.showMessageDialog(null,  "D");
		else if (testScore < 80)
			JOptionPane.showMessageDialog(null,  "C");
		else if (testScore < 90)
			JOptionPane.showMessageDialog(null,  "B");
		else
			JOptionPane.showMessageDialog(null,  "A");
		
		System.exit(0);
	}
}
