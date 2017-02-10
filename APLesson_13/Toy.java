public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String toyName)
	{
		this.name = toyName;
		this.count = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setCount(int newCount)
	{
		this.count = newCount;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + " " + count;
	}
}