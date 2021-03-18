package allFiles;

//Primitive data type arguments are passed by value, meaning that only a copy of an argument's value is passed
//into a parameter variable. Method parameter variables are separate and distinct from arguments. Variables changed
//within methods have no effect on the original argument.

public class PassByValue
{
	public static void main(String[] args)
	{
		//number starts with 99
		int number = 99;
		
		//display number's value
		System.out.println("Number: " + number);
		
		//Call ChangeMe and pass number as argument
		changeMe(number);
		
		//Display the number
		System.out.println("Number: " + number);
	}
	
	//ChangeMe accepts an argument and changes the parameter value
	public static void changeMe(int myValue)
	{
		System.out.println("Attempt to change number.");
		myValue = 0;
		
		//Display number
		System.out.println("The number is: " + myValue);
	}
}
