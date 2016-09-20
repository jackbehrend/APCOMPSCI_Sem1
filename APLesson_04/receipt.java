import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		receipt form = new receipt();
		
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
		
		double subtotal = price1 + price2 + price3;
		double tax = 0.08 * subtotal;
		double total = tax + subtotal;
		
		System.out.println("");
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		System.out.println("");
		form.formatReceipt(item1, price1);
		form.formatReceipt(item2, price2);
		form.formatReceipt(item3, price3);
		System.out.println("");
		form.total(subtotal, tax, total);
		System.out.println("");
		System.out.println("__________________________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void formatReceipt(String item, double price)
	{
		System.out.printf("* %15s ........      %.2f\n", item, price);
	}
	
	public void total(double subtotal, double tax, double total)
	{
		System.out.printf("* %15s ........      %.2f\n", "Subtotal:", subtotal);
		System.out.printf("* %15s ........      %.2f\n", "Tax:", tax);
		System.out.printf("* %15s ........      %.2f\n", "Total:", total);
	}
}