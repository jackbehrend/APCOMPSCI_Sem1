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
	}
}