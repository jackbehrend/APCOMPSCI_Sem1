import java.util.Scanner;

public class FindTheZs
{
	
	static String[] words;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[]args)
	{	
		words = new String[5];
		fillArray(words);
		System.out.println();
		printArray(words);
		System.out.println();
		hasZs(words);
	}
	
	public static void fillArray(String[] words)
	{
		System.out.println("Enter 5 words");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = scan.next();
		}
	}
	
	public static void printArray(String[] words)
	{
		System.out.print("For the words...");
		for (String word : words)
		{
			System.out.print(word + " ");
		}
	}
	
	public static void hasZs(String[] words)
	{
		System.out.print("Only ");
		for (String word : words)
		{
			if (word.contains("z"))
			{
				System.out.print(word + " ");
			}
		}
		System.out.print("contains the letter z");
	}
}