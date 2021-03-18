package allFiles;

public class ReturnArray
{
	public static void main(String[] args)
	{
		double[] values;
		values = getArray();
		for(double num : values)
			System.out.print(num + " ");
	}
	
	//get array method
	//@return a reference to an array of doubles.
	
	public static double[] getArray()
	{
		double[] array = {1, 2, 3, 4, 5};
		
		return array;
	}
}
