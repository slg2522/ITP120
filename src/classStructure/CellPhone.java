package classStructure;

import java.util.Scanner;

/**
 * 
 * @author Sabrina Groves
 * @version 2.0
 * @since 4/14/2021
 * 
 * Wireless Solutions is a business that sells cell phones and wireless service.
 * You are a programmer in the company's IT department, and your team is designing
 * a program to manage all of the cell phones that are in the inventory.
 * You have been asked to design a class that represents a cell phone.
 * 
 * I changed the model to be an integer, because most of the phones I know use numbers for models and it felt weird to insert a number as
 * a string. I hope that's ok? If not, I can change it.
 *
 */

public class CellPhone
{
	//scanner
	public static Scanner keyboard = new Scanner (System.in);
	
	String manufact;
	String model;
	double retailPrice;
	
	//the constructor
	public CellPhone()
	{
		manufact = null;
		model = null;
		retailPrice = 0.0;
	}
	
	//a modified constructor
	public CellPhone(String m, String mo, double p)
	{
		manufact = m;
		model = mo;
		retailPrice = p;
	}
	
	//sets the manufacturer with the user input
	public void setManufact(String m)
	{
		manufact = m;
	}
	
	//sets the model with the user input
	public void setModel(String mo)
	{
		model = mo;
	}
	
	//sets the price with the user input
	public void setRetailPrice(double p)
	{
		retailPrice = p;
	}
	
	//gets the manufacturer
	public String getManufact(String newManufact)
	{
		String manufacturer = newManufact;
		return manufacturer;
	}
	
	//gets the model number
	public String getModel(String newModel)
	{
		String model = newModel;
		return model;
	}
	
	//gets the price of the phone
	public double getRetailPrice(double retailPrice)
	{
		double price = retailPrice;
		return price;
	}
	
	//main method to call all the functions
	public static void main(String[] args)
	{
		//tell the user what is in the cellphone
		System.out.println("The default cellphone contains a null manufacturer, null model, and zero price. Follow the prompts to create a custom cellphone.");
		System.out.println();
		
		//get the user-input values
		System.out.println("Change the manufacturer here: ");
		String newManufacturer = keyboard.nextLine();
		
		System.out.println("Change the model here: ");
		String newModel = keyboard.nextLine();
		
		System.out.println("Change the retail price here: ");
		double newPrice = keyboard.nextDouble();
		
		//create a new CellPhone object
		CellPhone user = new CellPhone(newManufacturer, newModel, newPrice);
		
		//print out the information
		System.out.println("Updated Manufacturer: " + user.getManufact(newManufacturer));
		System.out.println("Updated Model: " + user.getModel(newModel));
		System.out.println("Updated Price: $" + user.getRetailPrice(newPrice));
		
	}
}
