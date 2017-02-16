public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket walkUp = new Walkup();
		Ticket advance = new Advance(5);
		Ticket studentAdvance = new StudentAdvance(10);
		
		System.out.println("Walkup Ticket");
		System.out.println(walkUp);
		
		System.out.println("Advance Ticket: 5 days");
		System.out.println(advance);
		
		System.out.println("Student Advance Ticket: 10 days");
		System.out.println(studentAdvance);
	}
}