public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		String listOfToys = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		
		ToyStore toyStore = new ToyStore(listOfToys);
		
		System.out.println(toyStore);
		System.out.println(toyStore.getMostFrequentToy());
		System.out.println(toyStore.getMostFrequentType());

		
	}
}