package allFiles;

public class IncrementDecrement
{
	public static void main(String[] args)
	{
	//increment = increase by one
		//Example: number = number + 1
		//Same as: number += 1
		//Same as: number++
	
	//decrement = decrease by one
		//Example: number = number - 1
			//Same as: number -= 1
			//Same as: number--
	
	//Post-fix & Pre-fix Modes
		//Pre-fix:
		int x = 1, y;
		y = ++x;
		System.out.println(y);
		//y=2
		
	//Post-fix:
		int z = 1, r;
		r = z++;
		System.out.println(r);
		//r=1
	}
}
