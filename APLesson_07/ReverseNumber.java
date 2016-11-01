import java.util.Scanner;

public class ReverseNumber
{
	
	static int rev = 0;
	static int num;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		num = scan.nextInt();
		
		getReverse();
		System.out.println(num + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		int number = num;
		while (number > 0)
		{
			rev *= 10;
			rev += (number % 10);
			number /= 10;
		}
	}
}