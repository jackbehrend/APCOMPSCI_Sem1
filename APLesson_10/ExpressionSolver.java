import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an equation");
		String expression = scan.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
	}
	
	public static String doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while (i < equation.size())
		{
			if (i < equation.size() && equation.get(i).equals("*"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) * Integer.parseInt(equation.get(i + 1))));
				
				equation.remove(i - 1);
				equation.remove(i);
				doEquation(equation);
			}
			else if (i < equation.size() && equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i - 1)) / Integer.parseInt(equation.get(i + 1))));
				
				equation.remove(i - 1);
				equation.remove(i);
				doEquation(equation);
			}
			i++;
		}
		
		int n = 0;
		while (n < equation.size())
		{
			if (n < equation.size() && equation.get(n).equals("+"))
			{
				equation.set(n, "" + (Integer.parseInt(equation.get(n - 1)) + Integer.parseInt(equation.get(n + 1))));
				
				equation.remove(n - 1);
				equation.remove(n);
			}
			else if (n < equation.size() && equation.get(n).equals("-"))
			{
				equation.set(n, "" + (Integer.parseInt(equation.get(n - 1)) - Integer.parseInt(equation.get(n + 1))));
				
				equation.remove(n - 1);
				equation.remove(n);
			}
			n++;
		}
		
		String listString = "";

		for (String s : equation)
		{
			listString += s + " ";
		}

		return listString;
	}
}