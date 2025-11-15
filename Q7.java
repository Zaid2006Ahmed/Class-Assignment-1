public class Q7 {
	public static void main(String[] args) {

        	int monthlyIncome = 50000;
        	int monthlyExpenses = 37500;
         	int laptopCost = 100000;
         	int monthlySavings = monthlyIncome - monthlyExpenses;
        	int monthsRequired = laptopCost / monthlySavings;

        System.out.println("Ahmed's monthly savings are: Rs " + monthlySavings);
        System.out.print("Months required to buy the laptop: " + monthsRequired);
    }
}
