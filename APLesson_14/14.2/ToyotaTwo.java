import java.util.Random;

public class ToyotaTwo extends CarTwo
{
	private double[] location;
	
	public ToyotaTwo()
	{
		location = new double[2];
		location[0] = 0;
		location[1] = 0;
	}
	
	public ToyotaTwo(String coordinates)
	{
		String[] coors = coordinates.split(", ");
		location = new double[2];
		location[0] = Double.parseDouble(coors[0]);
		location[1] = Double.parseDouble(coors[1]);
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}