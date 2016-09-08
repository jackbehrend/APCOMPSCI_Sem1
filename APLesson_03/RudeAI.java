import java.util.Scanner; //import statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		//search for the next integer entered
		String name = keyboard.next();
		
		//print the result
		System.out.println(name + "?! Why would anyone name a baby that?");
		
		//prompt for user input
		System.out.println("How old are you, " + name + "?");
		
		//search for the next integer entered
		int age = keyboard.nextInt();
		
		//print the result
		System.out.println("Oooo! " + age + " is getting up there.");
		
		//prompt for user input
		System.out.println("What do you do for fun, " + name + "?");
		
		//search for the next integer entered
		String fun = keyboard.next();
		
		//print the result
		System.out.println("I thought only nerds like to " + fun + ".");
		
		//prompt for user input
		System.out.println("What kind of music do you like, " + name + "?");
		
		//search for the next integer entered
		String music = keyboard.next();
		
		//print the result
		System.out.println("I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		//prompt for user input
		System.out.println("How many siblings do you have, " + name + "?");
		
		//search for the next integer entered
		int siblings = keyboard.nextInt();
		
		//print the result
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.");
		
		//prompt for user input
		System.out.println("What do you want to be when you grow up, " + name + "?");
		
		//search for the next integer entered
		String job = keyboard.next();
		
		//print the result
		System.out.println("I think you'd have to be smarter to be a " + job + ".");
		
		System.out.println("So " + name + ", you're " + age + "...");
		System.out.println("You like to " + fun + " and listen to " + music + "...");
		System.out.println("Good luck becoming a " + job + "...");
		System.out.println("I'm only kidding " + name + ".");
		
	}
}