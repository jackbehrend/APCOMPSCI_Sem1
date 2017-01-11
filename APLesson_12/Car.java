public class Car
{
	// instance variables
	private String paint, interior, engine, tires;
	
	// default constructor
	public Car()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	// constructor with params
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	// modifier
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	// accessors
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}