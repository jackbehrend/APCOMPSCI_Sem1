import java.util.Scanner;

public class Rectangle
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
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		perimeter = l * h;
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f sq ft around.", perimeter);
	}
}