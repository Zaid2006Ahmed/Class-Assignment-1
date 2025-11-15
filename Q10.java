import java.util.Scanner;
	public class Q10 {
    		public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        System.out.print("Total miles driven per day: ");
        	double milesPerDay = sc.nextDouble();
        System.out.print("Cost per gallon of gasoline: Rs");
        	double costPerGallon = sc.nextDouble();
        System.out.print("Average miles per gallon: ");
        	double mpg = sc.nextDouble();
        System.out.print("Parking fees per day: Rs");
        	double parking = sc.nextDouble();
        System.out.print("Tolls per day: Rs");
        	double tolls = sc.nextDouble();

        	double gallonsUsed = milesPerDay / mpg;
        	double fuelCost = gallonsUsed * costPerGallon;
        	double totalDailyCost = fuelCost + parking + tolls;

	System.out.printf("Total driving cost per day: Rs %.2f", totalDailyCost);

        sc.close();
    }
}
