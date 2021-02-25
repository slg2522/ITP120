package allFiles;

public class FormatPrintf
{
	public static void main(String[] args)
	{
		// %[flags][width][.precision]conversion-character
			// % 			all format specifiers begin with a % character
			//flags 		flags cuase the value to be formatted in a variety of ways
			//width			specify the minimum field width for the value
			//. precision	if floating, can specify number of decimal places for rounding
			//conversion	conversion character such as f for floating or d for decimal
		
		/*From baeldung (https://www.baeldung.com/java-printstream-printf):
		 * 
		 * Example: System.out.printf("Hello %s!%n", "World");  >>> Hello World!
		 * 
		 * Conversion-Characters:
		 * s for String
		 * d for decimal integers
		 * f for floating-point numbers
		 * t for date/time values
		 * 
		 * Line Separator:
		 * %n moves text onto the next line
		 * 			Example: System.out.printf("here%nwe%ngo%nagain");
		 * 
		 * Boolean Formatting:
		 * If the input value is true, the output is true. Otherwise the output is false.
		 * %b for lowercase
		 * %B for uppercase
		 * 			Example: System.out.printf("%b%n", null) >>> false
		 * 
		 * String Formatting:
		 * %s combination
		 * 			Example: printf("%s %n", "hello") >>> hello
		 * 			Single Quotation: printf("'%s' %n", "hello") >>> 'hello'
		 * 			Spaces: printf("'%15s' %n", "hello") >>> '               hello'
		 * 			Justify: printf("'%-10s' %n", "hello" >>> 'hello          '
		 * 			Limit Characters: System.out.printf("%2.2s", "Hi there!") >>> Hi
		 * 
		 * Char (Character Formatting:
		 * %c
		 * %C
		 * 			Lowercase: System.out.printf("%c%n", 't'); >>> t
		 * 			Uppercase: System.out.printf("%C%n", 't'); >>> T
		 * 
		 * Number Formatting:
		 * Accepts all of the integers (ex: byte, short, int, long, BigInteger) if %d is used.
		 * 			Example: System.out.printf("simple integer: %d%n", 10000L); >>> simple integer: 10000
		 * 			With Thousands Separator: System.out.printf(Locale.US, "%,d %n", 10000); >>> 10,000
		 * 			Thousands Separator UK: System.out.printf(Locale.ITALY, "%,d %n", 10000); >>> 10.000
		 * 
		 * Float & Double Formatting:
		 * %f
		 * 			Example: System.out.printf("%f%n", 5.1473); >>> 5.147300
		 * 			Precision: System.out.printf("'%5.2f'%n", 5.1473); >>> ' 5.15' (here width is defined as 5 (counts decimal as 1) and decimal length is 2)
		 * 			Scientific Notation: System.out.printf("'%5.2e'%n", 5.1473) >>> '5.15e+00'
		 * 
		 * Time Formatting:
		 * H, M, S characters extract the hours, minutes, and seconds from the input Date
		 * L, N represent time in milliseconds and nanoseconds respectively
		 * p adds a.m./p.m. formatting
		 * z prints out the time-zone offset
		 		Time default: Date today1 = new Date();
		 					  System.out.printf("%tT%n", today1);
		 					  13:51:15
		 		
		 		Time detail:  System.out.printf("hours %tH: minutes %tM: seconds %tS%n" , today1, today1, today1);
		 					  hours 13: minutes 51 : seconds 15
		 					  
		 		All argument: System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
		 					  13:51:15 pm 061 061000000 +0400
		 	
		 	Date Formatting:
		 	A prints out the full day for the week
		 	d formats a two-digit day of the month
		 	B is for the full month name
		 	m formats a two-digit month
		 	Y outputs a year in four digits
		 	y outputs the last two digits of the year
		 		
		 		Day and Month: System.out.printf("%1$tA, %1$tB %1$tY %n", date);
		 		Thursday, November 2018
		 		
		 		Numeric Date: System.out.printf("%1$td.%1$tm.%1$ty %n", date);
		 		22.11.18
		 		Perhaps flip the %1$td and %1$tm to make the month come first
		 
		 	Examples in Sentences:
		 	double temp = 78.42819;
		 	System.out.printf("The temperature is %.1f degrees. \n", temp);
		 	The temperature is 78.4 degrees.
		 	
		 	double value1 = 123.45678;
		 	double value2 = 123.45678;
		 	double value3 = 123.45678;
		 	System.out.printf("%.1f %.2f %.3f\n", value1, value2, value3);
		 	123.5 123.46 123.457 (due to rounding)
		 	
		 	double number = 12345.6789;
		 	System.out.printf("The number is:%12.2f\n", number);
		 	The number is:  12345.68
		 	
		 	Formatting inside sentence:
		 	double sales = 28756.89;
		 	System.out.printf("Sales for the month are %,.2f\n", sales);
		 	Sales for the month are 28,756.89
		 	
		 	For $ in expression:
		 	double monthlyPay = 5000.0;
		 	double annualPay = monthlyPay * 12;
		 	System.out.printf("Your annual pay is $%,.2f\n", annualPay);
		 	Your annual pay is $60,000.00
		 	
		 	Padding with Leading Zeros:
		 	double number = 123.4;
		 	System.out.printf("The number is:%08.1f\n", number);
		 	The number is:000123.4
		 	
		 	Left-Justifying Numbers:
		 	insert a minus sign (-) flag into the format specifier
		 	int num1 = 123;
		 	int num2 = 12;
		 	Display each variable left-justified in a field of 8 spaces:
		 	System.out.printf("%-8d%-8d\n", num1, num2);
		 	123           12
		 	
		 	Formatting String Arguments:
		 	String name1 = Jay;
		 	String name2 = Ozzy;
		 	To use the field width and left-justify with -:
		 	System.out.print("%-10s%-10s\n", name1, name2);
		 	Jay    Ozzy      
		 	
		 	Print arguments of different data types:
		 	int hours = 40;
		 	double pay = hours * 25;
		 	String name = "Jay";
		 	System.out.println("Name: %s, Hours: %d, Pay $%,.2f\n", name, hours, pay);
		 	Name: Jay, Hours: 40; Pay: $1,000.00
		 *  
		 */
	}
}
