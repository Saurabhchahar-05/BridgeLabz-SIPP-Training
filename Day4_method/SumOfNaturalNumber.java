package Day4_method;
import java.util.Scanner;

public class SumOfNaturalNumber {
	 public static int calculateSum(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive integer (n): ");
	        int n = scanner.nextInt();

	        if (n > 0) {
	            int result = calculateSum(n);
	            System.out.println("Sum of first " + n + " natural numbers is: " + result);
	        } else {
	            System.out.println("Please enter a positive integer.");
	        }

	        scanner.close();
	    }
	}
