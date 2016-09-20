public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "blaaah";
		double number1 = 7434.54564;
		form.format(word1, number1);
		
		String word2 = "yessss";
		double number2 = 3847483.43;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
}