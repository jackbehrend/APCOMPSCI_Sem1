public class RetMethods
{
	public static void main(String[]args)
	{
		RetMethods volCube = new RetMethods();
		RetMethods average = new RetMethods();
		int side1 = 3;
		int num1 = 3;
		int num2 = 8;
		int num3 = 15;
		double avg = average.calcAverage(num1, num2, num3);
		System.out.println(volCube.cube(side1));
		System.out.printf("The average is %10.2f\n", avg);
	}
	
	public int cube(int side)
	{
		return side*side*side;
	}
	
	public double calcAverage(int num1, int num2, int num3)
	{
		return (num1 + num2 + num3) / 3.0;
	}
}