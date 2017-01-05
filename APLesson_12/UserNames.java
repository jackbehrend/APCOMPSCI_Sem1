public class UserNames
{
	// instance variables
	private String userName, firstName, lastName;
	
	// default constructor
	public UserNames()
	{
		// default values for instance variables
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	// constructor with params
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName;
		lastName = lName;
	}
	
	// modifier
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	// accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}