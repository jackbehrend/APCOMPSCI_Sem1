public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem xbox = new XBox();
		GameSystem ps = new PlayStation();
		GameSystem pc = new PC();
		
		System.out.println(xbox);
		System.out.println(ps);
		System.out.println(pc);
	}
}