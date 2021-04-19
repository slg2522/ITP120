package thirdTest;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class handlingExceptions
{
	
	public static void main(String[] args)
	{
		//Handling Exceptions
		//To prevent exceptions from crashing your program, you must write code that detects and handles them.
		
		//all of the excpetions that we handle are in the exception category, including superclasses like IOException
		//(classes: EOFException, FileNotFoundException) and RuntimeException.
		
		//polymorphic references to exceptions
		//reference variable fo superclass type can reference subclass objects = polymorphism
		//catch clause that uses parameter variable of the Exception type is capable of catching any exception that inherits from the exception class
		
		//good examples of exception handling to recover from errors: Chapter 11: SalesReport2.java
		
		//try statements can only have one catch statement for each type of exception. Compiler will issue an error message if multiple form same type.
		//Example of a working statement:
		String hello = "hello";
		
		try
		{
			int num = Integer.parseInt(hello);
			System.out.println(num);
		}
		catch (NumberFormatException e)
		{
			System.out.println(hello + " is not a number.");
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Bad number format.");
		}
		
		//finally clause goes at the very end
		//can use to close the scanner
		
		//stack trace
		//list of all the methods in the call stack. Indicates the method that was executing when an exception occurred and all of the methods
		//that were called in order to execute that method.
		//Example: Chapter 11: StackTrace.java
		
		String str = "hi";
		try
		{
			int number = Integer.parseInt(str);
			System.out.println(number);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Use try catch block to handle exceptions.
		try
		{
			//try block statements
			File genericname = new File("NameOfFile.txt");
			Scanner inputFile = new Scanner(genericname);
			inputFile.close();
		}
		catch (FileNotFoundException e)
		{
			//catch block statements
			System.out.println("File not found.");
		}
		
		//handling multiple exceptions with one catch clause
		//Catch clauses can now handle more than one type of exception.
		//This code handles a NumberFormatException, or an IOEXception, or an InputMismatchException.
		//try
		//{
			//insert statements here
		//}
		//catch (NumberFormatException | IOException | InputMismatchException ex)
		//{
			//respondToError();
		//}
		
		//When code in a method throws an exception, normal execution is halted and JVM searches for a compatible exception handler inside the
		//method. If there is no code to handle it, then program control is passed to the previous method in the call stack (method that called
		//the offending program). If that method cannot handle, then control continues to be passed up all the way to the main method. If main
		//method cannot, then program is halted and default exception handler handles the exception.
		
		//Checked & Unchecked Exceptions
		//Unchecked Exceptions: inherit from Error Class of the RuntimeException class (do not handle)
		//Checked Exceptions: all of the remaining exceptions can be handled and should either: 1) handle the exception or 2) throws clause in
		//methods header
		
		//throws clause informs the compiler of the exception that could be thrown from a method
		//Example: public void displayFile(String name) throws FileNotFoundException
		
		//throw exception manually
		//general format for custom throws: throw new ExceptionType(MessageString);
		//example: throw new Exception("Out of fuel");
		//see Dice examples
		
		//use @exception for documentation
		//Example: @exception ExeptionName Description
	}
}
