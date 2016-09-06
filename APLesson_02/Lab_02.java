public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 2;
		int num2 = 4;
		int result = num1 * num2;
		System.out.println(num1 + " multiplied by " + num2 + " is " + result);

		System.out.println("");
		
		String name = "Jack Behrend";
		String address = "10607 Gingerwood Cove";
		String city = "San Diego, CA";
		String zip = "92130";
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + " " + zip);
		
		System.out.println("");
		
		int l = 2;
		int w = 3;
		int h = 4;
		int sa = 2 * ((w*l) + (h*l) + (h*w));
		System.out.println("The surface area of your rectangle is " + sa);
	}
}