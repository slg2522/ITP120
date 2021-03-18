package allFiles;

public class CallFromArray
{
	public static void main(String[] args)
	{
		//convert first name to upper case
		String[] names = {"tom", "fred"};
		System.out.println(names[0].toUpperCase());
		
		//assign first character in first name to letter
		char letter;
		letter = names[0].charAt(0);
		System.out.println(letter);
	}
}
