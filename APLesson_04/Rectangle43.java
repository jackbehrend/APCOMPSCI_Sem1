import java.util.Scanner;

public class Rectangle43
{
	
	static double perimeter;
	static double l;
	static double h;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length");
		l = scan.nextDouble();
		System.out.println("Enter height");
		h = scan.nextDouble();
		
		print();
	}
	
	public static double calcPerim()
	{
		return l * h;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f sq ft around.", calcPerim());
	}
}