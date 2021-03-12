package allFiles;

public class QuartersDollars
{
	public static void main(String[] args)
	{
		int quarters = 30;
		double dollars = quartersDollars(quarters);
		
		System.out.println("Number of quarters: " + quarters);
		System.out.println("Dollars: " + dollars);
		
		public static double quartersDollars(int quarters)
		{
			double dollars = quarters / 4;
		}
		return dollars;
	}
}
