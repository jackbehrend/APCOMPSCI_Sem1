import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = scan.nextInt();
		System.out.println("Enter y1");
		int y1 = scan.nextInt();
		System.out.println("Enter x2");
		int x2 = scan.nextInt();
		System.out.println("Enter y2");
		int y2 = scan.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.printf("Distance = %.2f", object.getDist());
		
		System.out.println();
		
		int newX1 = 12;
		int newY1 = 15;
		int newX2 = 43;
		int newY2 = 95;
		object.setValues(newX1, newY1, newX2, newY2);
		
		System.out.println("New values: " + "X1 = " + newX1 + ", Y1 = " + newY1 + ", X2 = " + newX2 + ", Y2 = " + newY2);
		System.out.printf("Distance = %.2f", object.getDist());
	}
}