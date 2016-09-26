import java.util.Scanner;

public class Avg
{
	
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = scan.nextDouble();
		System.out.println("Enter second number");
		num2 = scan.nextDouble();
		System.out.println("Enter third number");
		num3 = scan.nextDouble();
		
		average();
		print();
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3) / 3;
	}
	
	public static void print()
	{
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f", num1, num2, num3, avg);
	}
}