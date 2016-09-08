import java.util.Scanner; //import statement

public class BMICalc
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Enter your height(inches): ");
		
		//search for the next integer entered
		float height = keyboard.nextFloat();
		
		//prompt for user input
		System.out.println("Enter your weight(pounds): ");
		
		//search for the next integer entered
		float weight = keyboard.nextFloat();
		
		float bmi = (weight / (height * height)) * 703;
		
		//print the result
		System.out.println("Your BMI is " + bmi);
	}
}