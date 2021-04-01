package exception3_31;

public class StrangeNumberOfDaysException extends Exception
{
	/**Exception limiting total days in  month.
	 * @author Sabrina Groves
	 * @version 1.0
	 * @since 3/21/2021
	 */
	private static final long serialVersionUID = 1L;

	public StrangeNumberOfDaysException(String message)
	{
		//see specific messages in daysofTheMonth class
		super(message);
	}
}
