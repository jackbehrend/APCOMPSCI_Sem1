import java.util.Scanner;

public class Lesson_08
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		// System.out.println("Please enter your number");
		// System.out.println(countDigits(kb.nextInt()));
		
		System.out.println(factorial(8));
	}
	
	public static int countDigits(int num)
	{
		while (num > 0)
		{
			return 1 + (countDigits(num/10));
		}
		return 0;
	}
	
	public static int factorial(int n)
	{
		if (n == 1) return 1;
		return n * factorial(n - 1);
	}
}