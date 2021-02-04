package allFiles;
import javax.swing.JOptionPane;

public class InputBox
{
	public static void main(String[] args)
	{
		//What is your name? Input
		String fullName;
		fullName = JOptionPane.showInputDialog("What is your name?");
		
		//Displays the user's name
		JOptionPane.showMessageDialog(null, "Hi " + fullName + " .");
		
		//What is your age? Input
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		
		//Displays the user's age
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
		
		//What is your phone number? Input
		long phoneNumber = Long.parseLong(JOptionPane.showInputDialog("What is your cell phone number?"));
		
		//Displays the user's phone number
		JOptionPane.showMessageDialog(null, "Your phone number is " + phoneNumber + ".");
		
		//What is your email? Input
		String email = JOptionPane.showInputDialog(null, "What is your email address?");
		
		//Displays the user's email address
		JOptionPane.showMessageDialog(null, "Your email address is " + email + ".");
		
		//What is your GPA? Input
		double gpa = Double.parseDouble(JOptionPane.showInputDialog("What is your GPA?"));
		
		//Displays the user's GPA
		JOptionPane.showMessageDialog(null, "Your GPA is " + gpa + ".");
		
		System.exit(0);
	}
}



