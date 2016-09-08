import java.util.Scanner; //import statement

public class TriangleAreaCalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Enter height: ");
		
		//search for the next integer entered
		float height = keyboard.nextFloat();
		
		//prompt for user input
		System.out.println("Enter base: ");
		
		//search for the next integer entered
		float base = keyboard.nextFloat();
		
		float area = (base * height) / 2;
		
		//print the result
		System.out.println("The area of the triangle is " + area);
	}
}