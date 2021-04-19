package allFiles;

public class Question5
{
	public static void main(String[] args)
	{
		void getCar()
		{
			getColor();
		}
		
		void getColor()
		{
			throw new CarNotFoundException();
		}
	}
}
