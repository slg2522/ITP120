package allFiles;

/**This program demonstrates layered method calls. */

public class LayeredMethodCall
{
	public static void main(String[] args)
	{
		System.out.println("Location: Main Method");
		deep();
		System.out.println("Location: Main Method");
		deeper();
		System.out.println("Location: Main Method");
	}
	
	/**Goes within one method*/
	public static void deep()
	{
		System.out.println("Location: 1 Method Deep");
	}
	
	/** Goes within a different method*/
	public static void deeper()
	{
		System.out.println("Location: 2 Methods Deep");
	}
	
}
