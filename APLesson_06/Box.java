import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.next();
		System.out.println();
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}