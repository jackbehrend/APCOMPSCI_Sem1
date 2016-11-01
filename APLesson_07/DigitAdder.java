import java.util.Scanner;

public class DigitAdder
{
	
	static int sum = 0;
	static int num;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		num = scan.nextInt();
		
		sumDigits();
		System.out.println("The sum of the digits in " + num + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int number = num;
		while (number > 0)
		{
			sum += (number % 10);
			number /= 10;
		}
	}
}