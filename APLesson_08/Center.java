import java.util.Scanner;

public class Center
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word1 = scan.next();
		System.out.println("Please enter a word");
		String word2 = scan.next();
		System.out.println("Please enter a word");
		String word3 = scan.next();
		
		System.out.println("");
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String word)
	{
		if (word.length() <= 20)
		{
			word = " " + word + " ";
			return makeCenter(word);
		}
		else
		{
			return word;
		}
	}
}