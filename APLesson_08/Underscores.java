import java.util.Scanner;

public class Underscores
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		String sentence = scan.nextLine();
		
		System.out.println(replace(sentence));
	}
	
	public static String replace(String sentence)
	{
		if (sentence.indexOf(" ") >= 0)
		{
			return replace(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1));
		}
		else
		{
			return sentence;
		}
	}
}