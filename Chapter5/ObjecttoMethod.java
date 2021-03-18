package allFiles;

public class ObjecttoMethod
{
	public static void main(String[] args)
	{
		String name = "Warren";
		showLength(name);
	}
	
	public static void showLength(String str)
	{
		System.out.println("The length of " + str + " is: " + str.length() + " characters.");
	}
}
