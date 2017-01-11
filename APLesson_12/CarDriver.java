import java.util.Scanner;
public class CarDriver
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter paint");
		String paint = scan.nextLine();
		System.out.println("Enter interior");
		String interior = scan.nextLine();
		System.out.println("Enter engine");
		String engine = scan.nextLine();
		System.out.println("Enter tires");
		String tires = scan.nextLine();
		
		System.out.println();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());
	}
}