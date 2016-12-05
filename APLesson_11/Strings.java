import java.util.Scanner;

public class Strings
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		String[][] words = new String [4][4];
		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.println("Enter a word");
				String inputWord = scan.next();
				words[i][j] = inputWord;
			}
			
		}

		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}