public class Coin extends Money
{
	private String name, weight;
	private double value;
	
	public Coin()
	{
		super();
		this.weight = "";
	}
	
	public Coin(String n, String w, double v)
	{
		super(n, v);
		this.weight = w;
	}
	
	public String scan()
	{
		return weight;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" + super.toString();
	}
}