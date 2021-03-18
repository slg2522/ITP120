package allFiles;

public class Errors
{
	public static void main(String[] args)
	{
	int total = 0;
	int count = 1;
	while (count <= 100)
	{
		total += count;
		count = count + 1;
	}
	System.out.print("sum is ");
	System.out.println(total);
	}
}
