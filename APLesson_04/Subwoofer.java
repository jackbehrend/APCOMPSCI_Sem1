import java.util.Scanner;

public class Subwoofer
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		Subwoofer cubicFeet = new Subwoofer();
		
		System.out.println("Enter height in inches");
		double h = scan.nextDouble();
		
		System.out.println("Enter length in inches");
		double l = scan.nextDouble();
		
		System.out.println("Enter width in inches");
		double w = scan.nextDouble();
		
		double volume = cubicFeet.calcVol(h, l, w);
		System.out.println("");
		System.out.printf("The volume in cubic feet is %.2f", volume);
	}
	
	public double calcVol(double h, double l, double w)
	{
		double cubicInches = h * l * w;
		double cubicFeet = cubicInches / 1728.0;
		return cubicFeet;
	}
}