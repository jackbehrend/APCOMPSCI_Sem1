import java.util.Scanner;

public class GameHealth
{
	
	static int HEALTH_LOAD = 6;
	static String[] health = new String[HEALTH_LOAD];
	static int healthCount = 6;
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		String turn = "";
		int damage = 0;
		int amount = 0;
		
		while (turn.equals("Q") == false && healthCount > 0)
		{
			System.out.println("Your turn! Type 'R' when ready: ");
			turn = scan.next();
			damage = (int)(Math.random() * 2) + 1;
			amount = (int)(Math.random() * 6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCount -= amt;
			return "Taking " + amt + " damage!";
		}
		else
		{
			if (healthCount + dmg < HEALTH_LOAD)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTH_LOAD;
			}
			return "Power up " + amt + "!";
		}
	}
	
	public static void printClip()
	{
		String output = "Health: ";
		
		for (int i = 0; i < HEALTH_LOAD; i++)
		{
			if (i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}