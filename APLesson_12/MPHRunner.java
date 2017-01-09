import java.util.Scanner;
public class MPHRunner
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter distance in miles");
		int distance = scan.nextInt();
		System.out.println("Enter hours");
		int hours = scan.nextInt();
		System.out.println("Enter minutes");
		int minutes = scan.nextInt();
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " MPH");
	
		System.out.println();
	
		MilesPerHour object1 = new MilesPerHour();
		object1.setValues(500, 7, 30);
		
		System.out.println("New values: 500 miles, 7 hours, 30 minutes");
		System.out.println("500 miles in 7 hours and 30 minutes = " + object1.getMPH() + " MPH");
	}
}