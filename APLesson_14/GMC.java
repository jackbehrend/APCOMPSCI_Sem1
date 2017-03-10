import java.util.Random;

public class GMC extends Car
{
	private double xCoor, yCoor;
	
	public GMC()
	{
		xCoor = 0;
		yCoor = 0;
	}
	
	public GMC(double x, double y)
	{
		xCoor = x;
		yCoor = y;
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