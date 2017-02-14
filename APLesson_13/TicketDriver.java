public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket walkUp = new Walkup();
		Ticket advance = new Advance(5);
		Ticket studentAdvance = new StudentAdvance(10);
		
		System.out.println(walkUp);
		System.out.println(advance);
		System.out.println(studentAdvance);
	}
}