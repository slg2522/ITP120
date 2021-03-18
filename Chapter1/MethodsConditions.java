package allFiles;

public class MethodsConditions
	{
	public static void main(String[] args)
	{
		public static int days(int years, int months, int weeks)
		{
			
		}
	}
	}

package allFiles;

public class MethodsConditions
	{
	public static void main(String[] args)
	{
		public static double distance(double rate, double time)
		{
			
		}
	}
	}

package allFiles;

public class MethodsConditions
	{
	public static void main(String[] args)
	{
		public static long lightyears(long miles)
		{
			
		}
	}
	}

//argument: the variables being passed through the method/function after calling. Contains no data type.
//parameter: defines the type of variable to be used in the method/function. Contains a variable declaration.

//@param is used to comment on the definition of a specific parameter. 

//@return is used to comment on the output of the function, including its limits.

package allFiles;

public class MethodsConditions
	{
	public static void main(String[] args)
	{
		String name = "Sabrina";
		public static void myName(String name)
		{
			System.out.println(name)
		}
	}
	}

//5: "Able was I."
//10 and 100: "I saw Elba"

//b, c, d will cause an error
// b is a double, c is long, d is short.

//Outputs:
//System.out.println("I guess you like cats more");

package allFiles;

public class TimeOfDay
{
	public static void main(String[] args)
	{
	
	int time = 18;
	String timeOfDay;
	
	if (time >= 5 && time < 12)
		timeOfDay = "Morning";
		
		else if (time >= 12 && time < 20)
		{
			timeOfDay = "Daytime";
		}
		else
		{
			timeOfDay = "Night";
		}
	System.out.println(timeOfDay);
}

//
int dayOfTheWeek = 5;
boolean holiday = false;
if (dayOfTheWeek>1 && dayOfTheWeek < 6 || !holiday)
{
    System.out.println("Wake up at 7:00");
}
else if (dayOfTheWeek == 6 || dayOfTheWeek == 7 || holiday)
{
    System.out.println("Sleep in!");
}


// rewindAmount has to be declared and given a value outside the if

