import java.util.Scanner;

public class Lesson_07
{
	
	// static int number;
	// static int digits = 0;
	
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		// System.out.println("Please enter a number");
		// number = kb.nextInt();
		// countDigits();
		// System.out.println(number + " has " + digits + " digits.");
		
		System.out.println("Please enter a sentence");
		sentence = kb.nextLine();
		
		while (sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + sentence.substring(sentence.indexOf(" ") + 1);
		}
		
		System.out.println("Without spaces... " + sentence);
	}
	
	// public static void countDigits()
	// {
		// int num = number;
		// while (num > 0)
		// {
			// digits += 1;
			// num /= 10;
		// }
	// }
}