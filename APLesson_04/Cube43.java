import java.util.Scanner;

public class Cube43
{
	
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of side");
		side = scan.nextDouble();
		
		print();
	}
	
	public static double calcSurf()
	{
		return 6 * Math.pow(side, 2);
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with side length of %.5f is %.5f", side, calcSurf());
	}
}