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
}
