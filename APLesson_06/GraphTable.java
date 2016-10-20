import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num = scan.nextInt();
		System.out.println("Please enter the size of your table: ");
		int size = scan.nextInt();
		System.out.println();
		for (int i = 1; i <= size; i++)
		{
			System.out.printf("%d\t%d\n", i, i*num);
		}
	}
}