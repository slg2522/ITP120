package allFiles;

public class DayOfTheWeek
{
public static void main(String[] args)
	{
	int weekday = 5;
	boolean holiday;
		
		if (weekday == 6 || weekday == 7)
		{
			holiday = true;
			System.out.println("Sleep in!");
		}
		else
		{
			holiday = false;
			System.out.println("Wake up at 7:00");
		}
		
	}
}
