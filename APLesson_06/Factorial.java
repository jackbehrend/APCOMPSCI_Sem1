import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = scan.nextInt();
		int cloneNum = num;
		for (int i = 1; i < cloneNum; i++)
		{
			num *= i;
		}
		System.out.println("Factorial: " + num);
	}
}