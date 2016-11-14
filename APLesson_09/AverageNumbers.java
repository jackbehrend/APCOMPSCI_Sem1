import java.util.Scanner;

public class AverageNumbers
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int num : numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("Average: " + average(numbers));
	}
	
	public static int average(int[] array)
	{
		int avg = 0;
		
		for (int num : array)
		{
			avg += num;
		}
		
		avg /= 10;
		
		return avg;
	}
}