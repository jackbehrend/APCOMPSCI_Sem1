import static java.lang.Math.*;
public class Distance
{
	// instance variables
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	// default constructor
	public Distance()
	{
		distance = 0;
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	// constructor with params
	public Distance(int xFirst, int yFirst, int xSecond, int ySecond)
	{
		distance = 0;
		xOne = xFirst;
		yOne = yFirst;
		xTwo = xSecond;
		yTwo = ySecond;
	}
	
	// modifier
	public void setValues(int xFirst, int yFirst, int xSecond, int ySecond)
	{
		xOne = xFirst;
		yOne = yFirst;
		xTwo = xSecond;
		yTwo = ySecond;
	}
	
	// accessor
	public double getDist()
	{
		distance = Math.sqrt(((xTwo-xOne)*(xTwo-xOne))+((yTwo-yOne)*(yTwo-yOne)));
		return distance;
	}
}