package allFiles;

import java.util.Scanner;

public class MalesFemales
{
	public static void main(String[] args)
	{
		//creates a new scanner named scanner1
		Scanner scanner1 = new Scanner(System.in);	
		
		int males;
		int females;
		
		System.out.println("How many males are in the class?");
		males = Integer.parseInt(scanner1.nextLine());
		
		System.out.println("How many females are in the class?");
		females = Integer.parseInt(scanner1.nextLine());
		
		double total = males + females;
		
		double percentMales = (males / total)*100;
		double percentFemale = (females / total)*100;
		
		System.out.println("There are " + percentMales + "% males in the class, and there are " + percentFemale + "% females in the class.");
		
		//closes scanner2
		scanner1.close();
	}
}
