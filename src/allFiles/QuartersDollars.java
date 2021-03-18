package allFiles;

public class QuartersDollars
{
	public static void main(String[] args)
	{
		double quarters = 30;
		double dollars = quartersDollars(quarters);
		
		System.out.println("Number of quarters: " + quarters);
		System.out.println("Dollars: " + dollars);
		
	}
	
	public static double quartersDollars(double quarters)
	{
			double dollars = quarters / 4;
			return dollars;
	}
}
