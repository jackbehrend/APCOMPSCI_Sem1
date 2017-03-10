import java.util.Random;

public class Car implements Location
{
	private int id;
	private double xCoor, yCoor;
	
	public Car()
	{
		xCoor = 0;
		yCoor = 0;
		id = (new Random()).nextInt(900000) + 100000;
	}
	
	public Car(double x, double y)
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