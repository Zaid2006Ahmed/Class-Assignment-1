import java.util.Scanner;
	public class Q11 {
    		public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        int reverseNumber = (number % 10) * 10000 + ((number / 10) % 10) * 1000 + ((number / 100) % 10) * 100 + ((number / 1000) % 10) * 10 + (number / 10000);
        System.out.print("The reverse number: " + reverseNumber);

        sc.close();
    }
}
