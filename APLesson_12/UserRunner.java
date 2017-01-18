import java.util.Scanner;
public class UserRunner
{
	public static void main (String[]args)
	{
		askForAvatar();
	}
	
	public static void askForAvatar()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to use a public avatar? (y or n)");
		String option = scan.next();
		
		if (option.equals("y"))
		{
			System.out.println("Enter first name");
			String firstName = scan.next();
			System.out.println("Enter last name");
			String lastName = scan.next();
			System.out.println("Enter avatar");
			String avatar = scan.next();
			
			User newUser = new User(firstName, lastName, avatar);
			System.out.println();
			System.out.println(newUser.toString());
		}
		else if (option.equals("n"))
		{
			System.out.println("Enter first name");
			String firstName = scan.next();
			System.out.println("Enter last name");
			String lastName = scan.next();
			
			User newUser = new User(firstName, lastName);
			System.out.println();
			System.out.println(newUser.toString());
		}
		else
		{
			System.out.println("Please enter only y or n");
			askForAvatar();
		}
	}
}