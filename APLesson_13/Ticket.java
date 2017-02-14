import java.util.Random;

public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = (new Random()).nextInt(9000000) + 1000000;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + serialNo + "\nPrice: " + getPrice() + "\n";
	}
}