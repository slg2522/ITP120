package overriding;

import java.util.Scanner;

/**
 * Overloading:
 * Write a class named Car that has the following fields (see picture).
 * @author Sabrina Groves
 * @version 2.0
 * @since 4/15/2021
 */

//creates the car class (later to be used in object creation)
public class Car
{
	//scanner for the user's input
	private static Scanner keyboard = new Scanner (System.in);
	
	//the ingredients for a car
	int yearmodel;
	String make;
	int speed;

	//starting car values
	public Car(int yearmodel, String make, int speed)
	{
		yearmodel = 0;
		make = null;
		speed = 0;
	}
	
	//method to access the year model info
	public void getYearModel(int y)
	{
		yearmodel = y;
	}
	
	//method to access the make
	public void getMake(String m)
	{
		make = m;
	}
	
	//method to access the car speed
	public void getSpeed(int s)
	{
		speed = s;
	}
	
	//tells the car to accelerate (increases speed by 5)
	//@return new speed
	public int accelerate(int speed)
	{
		speed = speed + 5;
		return speed;
	}
	
	//tells the car to hit the brakes (decreases speed by 5)
	//@return new speed
	public int brake(int speed)
	{
		speed = speed - 5;
		return speed;
	}

	//use the main to create user's desired car and drive
	public static void main(String[] args)
	{
		//take in the user's car model
		System.out.println("What is the year model of the car? ");
		int useryear = keyboard.nextInt();
		
		//take in the user's car make
		System.out.println("What is the car's make? ");
		String usermake = keyboard.next();
		
		//hold the start speed at 0miles/hour
		int startspeed = 0;
		
		//create the user's car object
		Car usercar = new Car(useryear, usermake, startspeed);
		
		//print car details
		System.out.println("You are driving a " + useryear + " " + usermake + ". Currently, the car is stopped. This program will check the speed as it accelerates 5 times and then brakes 5 times.");
		
		//accelerate the car five times and tell the user the speed (this could probably also be accomplished with a for loop)
		int changespeed = startspeed;
		System.out.println("Current speed: " + changespeed + " miles/hour");
		
		//accelerate 5 times and tell the user the speed
		for(int index = 0; index < 5; index++)
		{
			changespeed = usercar.accelerate(changespeed);
			System.out.println("Current speed: " + changespeed + " miles/hour");
		}
		
		//hit the brakes five times and tell the user the speed (this could probably also be accomplished with a for loop)
		for(int index = 0; index < 5; index++)
		{
			changespeed = usercar.brake(changespeed);
			System.out.println("Current speed: " + changespeed + " miles/hour");
		}
	}
}
