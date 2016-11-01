import java.util.Scanner;

public class AverageDigits
{
	
	static int num;
	static int digits = 0;
	static int average = 0;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		num = scan.nextInt();
		
		avDigits();
		System.out.println("The average of the digits in " + num + " is " + average);
	}
	
	public static void avDigits()
	{
		int number = num;
		while (number > 0)
		{
			average += (number % 10);
			number /= 10;
			digits++;
		}
		average /= digits;
	}
}