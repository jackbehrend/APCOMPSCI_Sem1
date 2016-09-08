import java.util.Scanner; //import statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How old are you? ");
		
		//search for the next integer entered
		int num = keyboard.nextInt();
		
		//print the result
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome.");
		
		//prompt for user input
		System.out.println("Who is your favorite teacher? ");
		
		//search for the next integer entered
		String teacher = keyboard.next();
		
		//print the result
		System.out.println("Okay! " + teacher + " is very good.");
	}
}