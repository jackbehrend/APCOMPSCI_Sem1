import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter starting number");
		int start = scan.nextInt();
		
		System.out.println("Enter sequence size");
		int size = scan.nextInt();
		
		int[] seq = new int[size];
		
		System.out.println();
		for (int i = 0; i < size; i++)
		{
			if (i == 0 || i == 1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i - 1] + seq[i - 2];
			}
			
			System.out.println(seq[i] + " ");
		}
	}
}