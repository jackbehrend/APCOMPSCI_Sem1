public class User
{
	// instance variables
	private String firstName, lastName, avatar;
	private int userID;
	
	// default constructor
	public User()
	{
		firstName = "Undefined";
		lastName = "Undefined";
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	// constructor with params
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	// modifier
	public void setUserInfo(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
	}
	
	// accessor
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAvatar: " + avatar + "\nUser ID#: " + userID;
	}
}