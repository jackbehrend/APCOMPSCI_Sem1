import java.util.Scanner;

public class TreeDeg60
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word = scan.next();
		int start = 0;
		int stop = word.length();
		
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.println(word.substring(0, start));
			start++;
			tree(word, start, stop);
		}
	}
}