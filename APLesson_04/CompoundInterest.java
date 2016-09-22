import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		CompoundInterest interest = new CompoundInterest();
		
		System.out.println("Enter interest rate");
		double interestRate = scan.nextDouble();
		interestRate = interestRate / 100;
		
		System.out.println("Enter original amount to borrow");
		double principal = scan.nextDouble();
		
		System.out.println("Enter number of times the loan is compounded each year");
		double numberCompounded = scan.nextDouble();
		
		System.out.println("Enter life of the loan in years");
		double life = scan.nextDouble();
		
		 double total = interest.calcInterest(interestRate, principal, numberCompounded, life);
		 System.out.println("");
		 System.out.printf("Your total monthly payment is $%.2f\n", total);
	}
	
	public double calcInterest(double r, double p, double n, double t)
	{
		double monthlyPayment = (p * Math.pow((1 + (r / n)), (n * t)));
		return monthlyPayment / (12.0 * t);
	}
}