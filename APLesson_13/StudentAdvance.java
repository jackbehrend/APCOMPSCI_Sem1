public class StudentAdvance extends Advance
{
	public StudentAdvance(int numDaysLeft)
	{
		super(numDaysLeft);
	}
	
	public double getPrice()
	{
		return super.getPrice() / 2;
	}
	
	public String toString()
	{
		return super.toString() + "(STUDENT ID REQUIRED)";
	}
}