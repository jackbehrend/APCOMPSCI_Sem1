import java.util.Scanner;

public class GameGun
{
	
	static int bulletCount = 96;
	static int CLIP_SIZE = 16;
	static int shotCount = 0;
	static String[] clip = new String[CLIP_SIZE];
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		resetClip();
		printClip();
		
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action (R/S): ");
			String action = scan.next();
			if (action.equals("R"))
			{
				reload();
			}
			else if (action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of bullets!");
	}
	
	public static void resetClip()
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1;
			bulletCount -= 1;
			return "Boom!";
		}
		else
		{
			return "Reload!";
		}
	}
	
	public static void reload()
	{
		if (bulletCount >= CLIP_SIZE)
		{
			bulletCount -= CLIP_SIZE;
			shotCount = CLIP_SIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip();
		
		for (int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}	
		
	}
	
	public static void printClip()
	{
		String bulletOutput = "Bullets: " + bulletCount;
		String clipOutput = "Clip: ";
		
		for (int i = 0; i < CLIP_SIZE; i++)
		{
			clipOutput += clip[i];
		}
		
		System.out.println(bulletCount);
		System.out.println(clipOutput);
	}
}