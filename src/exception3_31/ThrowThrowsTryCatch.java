package exception3_31;

import java.io.*;

public class ThrowThrowsTryCatch
{
		void testMethod (int num) throws IOException, ArithmeticException
		{
			if (num == 1)
				throw new IOException ("IOException Occurred");
			else
				throw new ArithmeticException ("ArithmeticException");	
		}
}
class Main
{
	public static void main(String[] args)
	{
		try
		{
			ThrowThrowsTryCatch obj = new ThrowThrowsTryCatch();
			obj.testMethod(1);
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
	}
}
