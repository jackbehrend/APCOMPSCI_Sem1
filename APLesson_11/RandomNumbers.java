public class RandomNumbers
{
	public static void main(String[]args)
	{
		int[][] nums = new int [4][4];
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = (int)(Math.random() * 100) + 1;
			}
			
		}

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums[i].length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}