import java.util.Scanner;

public class Lesson_09
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		// String[] names = new String[5];
		
		// System.out.println("Enter 5 names");
		
		// // Fills the array
		// for (int i = 0; i < names.length; i++)
		// {
			// names[i] = scan.next();
		// }
		
		// // Print the array
		// for (String name : names)
		// {
			// System.out.print("\"" + name.length() + "\", ");
		// }
		
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for (int num : numbers)
		{
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("Sum: " + summArray(numbers));
	}
	
	public static int summArray(int[] n)
	{
		int sum = 0;
		
		for (int num : n)
		{
			sum += num;
		}
		
		return sum;
	}
}