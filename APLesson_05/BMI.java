import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches");
		double h = kb.nextDouble();
		System.out.println("Enter weight in pounds");
		double w = kb.nextDouble();
		
		double bmi = 0.0;
		String condition = "";
		
		bmi = calcBMI(h, w);
		condition = calcCondition(bmi);
		
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your are " + condition);
	}
	
	public static double calcBMI(double height, double weight)
	{
		return (weight / (height * height)) * 703;
	}
	
	public static String calcCondition(double bmi)
	{
		if (bmi < 18.5)
			return "underweight";
		else if (bmi >= 18.5 && bmi <= 24.9)
			return "normal";
		else if (bmi >= 25.0 && bmi <= 29.9)
			return "overweight";
		else if (bmi >= 30.0 && bmi <= 34.9)
			return "obese";
		else if (bmi >= 35.0 && bmi <= 39.9)
			return "very obese";
		else
			return "morbidly obese";
	}
}