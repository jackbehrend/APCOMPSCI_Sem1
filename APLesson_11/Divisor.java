import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		int[][] nums = new int [4][4];
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100) + 1;
			}
			
		}
		
		System.out.println("Enter a number");
		int divisor = scan.nextInt();

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		int count = 0;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				if (nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");
	}
}