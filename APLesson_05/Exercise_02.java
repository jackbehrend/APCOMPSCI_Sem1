import java.util.Scanner;

public class Exercise_02
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = scan.nextLine();
		System.out.println("Please enter price:");
		double price1 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = scan.nextLine();
		System.out.println("Please enter price:");
		double price2 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = scan.nextLine();
		System.out.println("Please enter price:");
		double price3 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Please enter item 4:");
		String item4 = scan.nextLine();
		System.out.println("Please enter price:");
		double price4 = scan.nextDouble();
		scan.nextLine();
		
		double subtotal = price1 + price2 + price3 + price4;
		double tax = 0.08 * subtotal;
		double total = tax + subtotal;
		double discount = discount(total);
		total = total - discount;
		
		System.out.println("");
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.println("");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("");
		total(subtotal, tax, discount, total);
		System.out.println("");
		System.out.println("__________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
	public static double discount(double total)
	{
		if (total >= 2000.0)
			return (.15 * total);
		else
			return 0;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("* %15s ........      %.2f\n", item, price);
	}
	
	public static void total(double subtotal, double tax, double discount, double total)
	{
		System.out.printf("* %15s ........      %.2f\n", "Subtotal:", subtotal);
		System.out.printf("* %15s ........      %.2f\n", "Tax:", tax);
		System.out.printf("* %15s ........      %.2f\n", "Discount:", discount);
		System.out.printf("* %15s ........      %.2f\n", "Total:", total);
	}
}