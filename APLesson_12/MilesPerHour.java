import static java.lang.Math.*;
public class MilesPerHour
{
	// instance variables
	private int distance, hours, minutes;
	private double mph;
	
	// default constructor
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	// constructor with params
	public MilesPerHour(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	// modifier
	public void setValues(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
	}
	
	// accessor
	public int getMPH()
	{
		mph = Math.round(distance / (hours + (minutes / 60.0)));
		int miPerHr = (int) mph;
		return miPerHr;
	}
}