public class Bill extends Money
{
	private String name, face;
	private double value;
	
	public Bill()
	{
		super();
		face = "";
	}
	
	public Bill(String n, String f, double v)
	{
		super(n, v);
		face = f;
	}
	
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" + super.toString();
	}
}