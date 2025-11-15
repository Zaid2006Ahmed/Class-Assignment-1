public class Q9 {
	public static void main(String[] args) {

        	int P = 1200000;
        	double annualRate = 0.12;
        	double r = annualRate / 12;
        	int n = 5 * 12;
        	double payment = (P * r) / (1 - Math.pow(1 + r, -n));

        System.out.printf("Hassan's monthly car loan installment: Rs. %.2f", payment);
    }
}
