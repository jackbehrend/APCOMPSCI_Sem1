import java.util.Scanner;

public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("You walk into a house and see two doors...\n1. Door 1 \n2. Door 2");
		int choice = scan.nextInt();
		
		if (choice == 1)
		{
			System.out.println("There is a scary clown inside...Choose your weapon...\n1. Baseball bat \n2. Golf club");
			int clownChoice = scan.nextInt();
			if (clownChoice == 1)
			{
				System.out.println("He took your bat...\n1. Fight \n2. Hide");
				int batChoice = scan.nextInt();
				if (batChoice == 1)
				{
					System.out.println("You knocked him out and got away safely");
				}
				else
				{
					System.out.println("He found you under the table and dragged you into his car...");
				}
			}
			else
			{
				System.out.println("You knocked him down...\n1. Call the police \n2. Run away");
				int clubChoice = scan.nextInt();
				if (clubChoice == 1)
				{
					System.out.println("The police arrived and arrested the clown");
				}
				else
				{
					System.out.println("You tripped and the clown caught up to you...");
				}
			}
		}
		else if (choice == 2)
		{
			System.out.println("You entered the garage...Choose a car...\n1. Bugatti \n2. Tesla");
			int carChoice = scan.nextInt();
			if (carChoice == 1)
			{
				System.out.println("The police caught you speeding...\n1. Lose the cops \n2. Pull over");
				int bugattiChoice = scan.nextInt();
				if (bugattiChoice == 1)
				{
					System.out.println("You lost them eventually after zooming at 180 mph");
				}
				else
				{
					System.out.println("The cop gave you a ticket...");
				}
			}
			else
			{
				System.out.println("You hit someone's car on the freeway...\n1. Keep going \n2. Pull over");
				int teslaChoice = scan.nextInt();
				if (teslaChoice == 1)
				{
					System.out.println("The person you hit called the cops and they found you...");
				}
				else
				{
					System.out.println("The damage was minimal and the owner of the other car let you off the hook");
				}
			}
		}
		else
		{
			System.out.println("Not an option");
		}
	}
}