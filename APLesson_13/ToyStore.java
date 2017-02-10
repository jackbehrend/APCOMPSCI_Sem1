import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String newToyList)
	{
		loadToys(newToyList);
	}
	
	public void loadToys(String newToyList)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(newToyList.split(", ")));
		
		for (int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			
			Toy toyObject = getThatToy(name);
			
			if (toyObject == null)
			{
				if (type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if (type.equals("AF"))
				{
					toyList.add(new ActionFigure(name));
				}
			}
			else
			{
				toyObject.setCount(toyObject.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String toyName)
	{
		for (Toy toy : toyList)
		{
			if (toy.getName().equals(toyName))
			{
				return toy;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for (Toy toy : toyList)
		{
			if (max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int actionFigures = 0;
		
		for (Toy toy : toyList)
		{
			if (toy.getType().equals("Car"))
			{
				cars++;
			}
			else if (toy.getType().equals("AF"))
			{
				actionFigures++;
			}
		}
		
		if (cars > actionFigures)
		{
			return "Cars";
		}
		else if (cars < actionFigures)
		{
			return "Action Figures";
		}
		return "Equal amounts of action figures and cars";
	}
	
	public String toString()
	{
		return toyList.toString();
	}
}