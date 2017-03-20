import java.util.Random;

public class CarTwo implements LocationTwo
{
	private int id;
	private double xCoor, yCoor;
	
	public CarTwo()
	{
		xCoor = 0;
		yCoor = 0;
		id = (new Random()).nextInt(900000) + 100000;
	}
	
	public CarTwo(double x, double y)
	{
		xCoor = x;
		yCoor = y;
		id = (new Random()).nextInt(900000) + 100000;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double x, double y)
	{
		xCoor += x;
		yCoor += y;
	}
	
	public double[] getLoc()
	{
		double[] loc = {xCoor, yCoor};
		return loc;
	}
}