import java.util.Random;

public class HondaTwo extends CarTwo
{
	private double xCoor, yCoor;
	
	public HondaTwo()
	{
		xCoor = 0;
		yCoor = 0;
	}
	
	public HondaTwo(double[] coordinates)
	{
		xCoor = coordinates[0];
		yCoor = coordinates[1];
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