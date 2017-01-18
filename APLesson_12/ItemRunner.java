import java.util.Scanner;
public class ItemRunner
{
	public static void main (String[]args)
	{
		askForCategoryAndPrice();
	}
	
	public static void askForCategoryAndPrice()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to enter category and price information? (y or n)");
		String option = scan.next();
		
		if (option.equals("y"))
		{
			System.out.println("Enter manufacturer");
			String manufacturer = scan.next();
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter category");
			String category = scan.next();
			System.out.println("Enter price");
			double price = scan.nextDouble();
			
			Item newItem = new Item(manufacturer, name, category, price);
			System.out.println();
			System.out.println(newItem.toString());
		}
		else if (option.equals("n"))
		{
			System.out.println("Enter manufacturer");
			String manufacturer = scan.next();
			System.out.println("Enter name");
			String name = scan.next();
			
			Item newItem = new Item(manufacturer, name);
			System.out.println();
			System.out.println(newItem.toString());
		}
		else
		{
			System.out.println("Please enter only y or n");
			askForCategoryAndPrice();
		}
	}
}