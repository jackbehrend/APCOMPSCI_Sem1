import java.util.Random;

public class GMCTwo extends CarTwo
{
	private double xCoor, yCoor;
	
	public GMCTwo()
	{
		xCoor = 0;
		yCoor = 0;
	}
	
	public GMCTwo(double x, double y)
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