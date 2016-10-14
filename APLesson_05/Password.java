import java.util.Scanner;

public class Password
{
	
	static Scanner scan;
	
	public static void main(String[]args)
	{
		scan = new Scanner(System.in);
		
		String checkUsername = "freddyfalcon";
		String checkPassword = "cardinalgold";
		passCheck(checkUsername, checkPassword);
	}
	
	public static void passCheck(String checkUsername, String checkPassword)
	{
		System.out.println("Enter username");
		String username = scan.next();
		System.out.println("Enter password");
		String password = scan.next();
		
		if (username.equals(checkUsername))
		{
			if (password.equals(checkPassword))
			{
				System.out.println("Access granted");
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			if (password.equals(checkPassword))
			{
				System.out.println("Username is incorrect");
			}
			else
			{
				System.out.println("Username and password are incorrect");
			}
		}
	}
}