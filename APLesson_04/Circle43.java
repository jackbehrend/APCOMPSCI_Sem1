import java.util.Scanner;

public class Circle43
{
	
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius");
		r = scan.nextDouble();
		
		print();
	}
	
	public static double calcArea()
	{
		return Math.PI * Math.pow(r, 2);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %.5f is %.5f", r, calcArea());
	}
}