import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		String[] names = new String[5];
		
		System.out.println("Enter 5 names");
		
		for (int i = 0; i < names.length; i++)
		{
			names[i] = scan.next();
		}
		
		System.out.println();
		System.out.println("In order...");
		for (String name : names)
		{
			System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println("Reversed...");
		reverse(names);
	}
	
	public static void reverse(String[] array)
	{
		for (int i = array.length - 1; i >= 0; i--)
		{
			System.out.print(array[i] + " ");
		}
	}
}