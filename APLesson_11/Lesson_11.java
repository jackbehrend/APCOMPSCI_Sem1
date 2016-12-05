public class Lesson_11
{
	public static void main(String[]args)
	{
		// Filling the array
		int[][] values = new int [4][4];
		values [0][0] = 1;
		values [1][1] = 2;
		values [2][2] = 3;
		values [3][3] = 4;
		
		int num = 1;
		// for (int i = 0; i < values.length; i++)
		// {
			// for (int j = 0; j < values[i].length; j++)
			// {
				// values[i][j] = num;
				// num++;
			// }
		// }
		
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				values[j][i] = num;
				num++;
			}
			
		}
		
		// Print the array
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Search the array
		int count = 0;
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[i].length; j++)
			{
				if (values[i][j] % 5 == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " multiples of 5 in the Array.");
	}
}