public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(int numDaysLeft)
	{
		daysLeft = numDaysLeft;
		getPrice();
	}
	
	public double getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30;
		}
		return 40;
	}
}