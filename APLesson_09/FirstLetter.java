import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		String[] words = new String[5];
		
		System.out.println("Enter 5 words");
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = scan.next();
		}
		
		System.out.println();
		first(words);
	}
	
	public static void first(String[] array)
	{
		for (String word : array)
		{
			System.out.println(word.charAt(0));
		}
	}
}