import java.util.ArrayList;
import java.util.Random;

public class SatelliteTwo
{
    public static void main(String[]args)
    {
		ArrayList<LocationTwo> locate = new ArrayList<>();
        double[] honLoc = {5, 6};
        locate.add(new HondaTwo(honLoc));
        locate.add(new ToyotaTwo("8, 9"));
        locate.add(new GMCTwo(3, 8));


        double[] home = {0, 0};


        String printout = "\n\n" +
                "==========================" + "\nStarting locations...";


        for (LocationTwo l : locate)
        {
            printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
        }


        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


        for (LocationTwo l : locate)
        {
            printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
        }
		
		printout += "\n\n" + "==========================" +
                   "\nDistance from home after cars moved...";


        for (LocationTwo l : locate)
        {
			double one = Math.round(((Math.random()) * 100) + 1);
			double two = Math.round(((Math.random()) * 100) + 1);
            printout += "\n\nAfter " + l.getID() + " moved (" + one + ", " + two + ")";
			l.move(one, two);
			printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")";
        }
		
		printout += "\n\n" + "==========================" +
                   "\nNew distance from home...";


        for (LocationTwo l : locate)
        {
			printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
        }
		

        System.out.println(printout);
    }


    public static double getDistance(double[] car, double[] home)
    {
        return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
    }


    public static String getLocation(double[] loc)
    {
        return loc[0] + ", " + loc[1];
    }
}