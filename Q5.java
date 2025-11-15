import java.util.Scanner;
	public class Q5 {
  	 	public static void main(String[] args) {
       	 	Scanner sc = new Scanner(System.in);
		
		double companyRate = 60;
       		double solarRate = 7;
        System.out.print("Enter units consumed from solar system: ");
        	double solarUnits = sc.nextDouble();
        System.out.print("Enter units consumed from electricity company: ");
        	double companyUnits = sc.nextDouble();

        	double totalUnits = solarUnits + companyUnits;
        	double totalBillCompany = totalUnits * companyRate;
      	 	double actualBill = (solarUnits * solarRate) + (companyUnits * companyRate);
        	double savings = totalBillCompany - actualBill;

        System.out.printf("Total bill if all from electricity company: Rs. %.2f\n", totalBillCompany);
        System.out.printf("Actual bill: Rs. %.2f\n", actualBill);
        System.out.printf("Total savings using solar power: Rs. %.2f\n", savings);
    }
}
