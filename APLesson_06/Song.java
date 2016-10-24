public class Song
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye!", 1);
	}
	
	public static void sing(String word, int repeat)
	{
		for (int i = 1; i <= repeat; i++)
		{
			if (i != repeat)
			{
				System.out.printf("%s ", word);
			}
			else
			{
				System.out.printf("%s\n", word);
			}
		}
	}
}