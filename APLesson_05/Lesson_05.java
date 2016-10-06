import java.util.Random;
import java.util.Scanner;

public class Lesson_05
{
	public static void main(String[]args)
	{
		int num = 3;
		boolean tOrF = true;
		int random = (int)((1 + Math.random() * 101));
		System.out.println(random);
		int number = 8 % 6;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num 1");
		int one = scan.nextInt();
		System.out.println("Enter num 2");
		int two =  scan.nextInt();
		
		boolean even = (one + two) % 2 ==0;
		
		if (even)
		{
			System.out.println("even");
		}
		if (!even)
		{
			System.out.println("odd");
		}
		
		if (num == 5)
		{
			System.out.println("num = 5");
		}
		if (num == 3)
		{
			System.out.println("num = 3");
		}
		
		if (tOrF())
		{
			System.out.println("true");
		}
		if (!tOrF())
		{
			System.out.println("false");
		}
	}
	
	public static boolean tOrF()
	{
		return 2 >= 5;
	}
}