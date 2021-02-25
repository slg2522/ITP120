package allFiles;

/**What will be the output of this program? */

public class MysteryFunction
{
	public static void main(String[] args)
	{
		int num1 = 99;
				double num2 = 1.5;
				System.out.println(num1 + " " + num2);
		myMethod(num1, num2);
		System.out.println(num1 + " " + num2);
	}
	public static void myMethod(int i, double d)
	{
		System.out.println(i + " " + d);
		i = 0;
		d = 0.0;
		System.out.println(i + " " + d);
	}
}

//Output:
//99 1.5
//99 1.5
//0 0.0
//99 1.5

