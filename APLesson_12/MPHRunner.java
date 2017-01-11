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
		
		System.out.println("Enter new distance in miles");
		int newDistance = scan.nextInt();
		System.out.println("Enter new hours");
		int newHours = scan.nextInt();
		System.out.println("Enter new minutes");
		int newMinutes = scan.nextInt();
		object.setValues(newDistance, newHours, newMinutes);
		
		System.out.println();
		System.out.println(newDistance + " miles in " + newHours + " hours and " + newMinutes + " minutes = " + object.getMPH() + " MPH");
	}
}