import java.util.Scanner;

public class id
{
	public static void main(String[]args)
	{
		id form = new id();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = scan.next();
		System.out.println("Enter your last name:");
		String lastName = scan.next();
		System.out.println("Enter your title:");
		String title = scan.next();
		scan.nextLine();
		System.out.println("Enter the school site:");
		String school = scan.nextLine();
		System.out.println("Enter the school year:");
		String year = scan.next();
		scan.nextLine();
		System.out.println("What is your subject?");
		String subject = scan.nextLine();
		
		System.out.println("");
		System.out.println("**************************************************");
		form.formatID(school, year);
		form.formatID(firstName, lastName);
		form.formatID(title, subject);
		System.out.println("**************************************************");
	}
	
	public void formatID(String item1, String item2)
	{
		System.out.printf("* %18s          %18s *\n", item1, item2);
	}
}