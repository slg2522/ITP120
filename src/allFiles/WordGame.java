package allFiles;

import javax.swing.JOptionPane;

public class WordGame
{

	public static void main(String[] args)
	{
		//Gets the user's name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//Gets the user's age
		int age = IntegerparseInt(JOptionPane.showInputDialog("What is your age?"));
		
		//Gets the user's city
		String city = JOptionPane.showInputDialog("Which city do you live in?");
		
		//Gets the user's college
		String college = JOptionPane.showInputDialog("Where do you attend college?");
		
		//Gets the user's profession
		String profession = JOptionPane.showInputDialog("What is your profession?");
		
		//Gets the user's animal pet type
		String animal = JOptionPane.showInputDialog("What animal do you have for a pet?");
		
		//Gets the user's pet's name
		String petName = JOptionPane.showInputDialog("What is your pet's name?");
		
		//Displays a message summarizing the information to the user
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + ", who lived in " + city + ". " + name + " was " + age + " years old and attended " + college + ", while working as a " + profession + ". " + name + " lived with a pet" + animal + ", named " + petName + ".");

		System.exit(0);
	}

	private static int IntegerparseInt(String showInputDialog) {
		// TODO Auto-generated method stub
		return 0;
	}

}
