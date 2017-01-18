public class Item
{
	// instance variables
	private String itemManufacturer, itemName, itemCategory;
	private long itemUPC;
	private double itemPrice;
	
	// default constructor
	public Item()
	{
		itemManufacturer = "Undefined";
		itemName = "Undefined";
		itemCategory = "Undefined";
		itemUPC = (long)(Math.random() * 10000000000L);
		itemPrice = 0;
	}
	
	// constructor with params
	public Item(String m, String n)
	{
		itemManufacturer = m;
		itemName = n;
		itemCategory = "Undefined";
		itemUPC = (long)(Math.random() * 10000000000L);
		itemPrice = 0;
	}
	
	public Item(String m, String n, String c, double p)
	{
		itemManufacturer = m;
		itemName = n;
		itemCategory = c;
		itemUPC = (long)(Math.random() * 10000000000L);
		itemPrice = p;
	}
	
	// modifier
	public void setItemInfo(String m, String n, String c, double p)
	{
		itemManufacturer = m;
		itemName = n;
		itemCategory = c;
		itemPrice = p;
	}
	
	// accessor
	public String toString()
	{
		return "Item Info...\nManufacturer: " + itemManufacturer + "\nName: " + itemName + "\nCategory: " + itemCategory + "\nUPC: " + itemUPC + "\nPrice: " + itemPrice;
	}
}