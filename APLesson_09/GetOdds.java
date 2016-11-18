public class GetOdds
{
	
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		printArray(numbers);
		System.out.println();
		getOdds(numbers);
	}
	
	public static void fillArray(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray(int[] numbers)
	{
		System.out.print("For the following numbers...");
		for (int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	
	public static void getOdds(int[] numbers)
	{
		System.out.print("These numbers: ");
		for (int num : numbers)
		{
			if (num % 2 != 0)
			{
				System.out.print(num + " ");
			}
		}
		System.out.print("are odd");
	}
}