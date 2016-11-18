public class BiggestNumber
{
	
	static int[] numbers;
	
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray(numbers);
		printArray(numbers);
		System.out.println();
		getBiggest(numbers);
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
	
	public static void getBiggest(int[] numbers)
	{
		int max = 0;
		
		System.out.print("The biggest number is ");
		for (int num : numbers)
		{
			if (num > max)
			{
				max = num;
			}
		}
		System.out.print(max);
	}
}