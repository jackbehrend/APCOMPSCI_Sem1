import java.util.Scanner;
public class ReverseTri
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = scan.next();
		System.out.println();
		for (int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}