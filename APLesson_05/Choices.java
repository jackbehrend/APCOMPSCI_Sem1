import java.util.Scanner;

public class Choices
{
	public static void main(String[]args)
	{
		// int number = 5;
		
		// if (number > 4)
			// System.out.println("Meets 1 condition");
			// if (number <= 10)
				// System.out.println("Meets the 2 conditions");
		// else
			// System.out.println("Meets 0 conditions");
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." + 
							"\n 1. Do a math problem" + 
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if (mathOrWords == 1)
		{
			System.out.println("What is 2x2?");
			int mathAnswer = kb.nextInt();
			if (mathAnswer == 4)
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
		else
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if (wordAnswer.equals("Abraham Lincoln"))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
	}
}