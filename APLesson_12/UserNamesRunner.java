public class UserNamesRunner
{
	public static void main (String[]args)
	{
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("Username: " + object.getUserName());
		
		UserNames object1 = new UserNames();
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object1.getFirstName() + " " + object1.getLastName());
		System.out.println("Username: " + object1.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<< USER INFO >>>>>>>");
		System.out.println("Name: " + object.getFirstName() + " " + object.getLastName());
		System.out.println("Username: " + object.getUserName());
	}
}