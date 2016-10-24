import java.util.Scanner;
public class LeftTri
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = scan.next();
		System.out.println();
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word.substring(i));
		}
	}
}