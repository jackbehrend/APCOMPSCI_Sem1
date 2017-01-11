import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your hair");
		String hair = scan.next();
		System.out.println("Enter your eyes");
		String eyes = scan.next();
		System.out.println("Enter your skin");
		String skin = scan.next();
		
		System.out.println();
		
		Human object = new Human(hair, eyes, skin);
		
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
		
		System.out.println();
		
		System.out.println("Enter friend's hair");
		String fHair = scan.next();
		System.out.println("Enter friend's eyes");
		String fEyes = scan.next();
		System.out.println("Enter friend's skin");
		String fSkin = scan.next();
		
		System.out.println();
		
		object.setFeatures(fHair, fEyes, fSkin);
		
		System.out.println("Friend's info...");
		System.out.println("Hair: " + object.getHair());
		System.out.println("Eyes: " + object.getEyes());
		System.out.println("Skin: " + object.getSkin());
	}
}