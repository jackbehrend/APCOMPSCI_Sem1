public class Exercise_01
{
	public static void main(String[]args)
	{
		int userRoll = 1 + (int)((Math.random() * 6));
		int compRoll = 1 + (int)((Math.random() * 6));
		
		System.out.println("You rolled a " + userRoll);
		System.out.println("Computer rolled a " + compRoll);
		
		System.out.println("Winner: " + rollDice(userRoll, compRoll));
	}
	
	public static String rollDice(int userRoll, int compRoll)
	{
		if (userRoll > compRoll)
			return "You";
		else if (userRoll < compRoll)
			return "Computer";
		else
			return "Tie";
	}
}