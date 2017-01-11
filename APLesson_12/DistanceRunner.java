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
		System.out.printf("Distance = %.2f\n", object.getDist());
		
		System.out.println();
		
		System.out.println("Enter new x1");
		int nX1 = scan.nextInt();
		System.out.println("Enter new y1");
		int nY1 = scan.nextInt();
		System.out.println("Enter new x2");
		int nX2 = scan.nextInt();
		System.out.println("Enter new y2");
		int nY2 = scan.nextInt();
		
		object.setValues(nX1, nY1, nX2, nY2);
		
		System.out.println();
		System.out.printf("Distance = %.2f", object.getDist());
	}
}