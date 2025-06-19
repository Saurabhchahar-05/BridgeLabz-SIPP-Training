package Day2_controlflow;
import java.util.Scanner;
public class SumUntilZeroOrNegative {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        int sum = 0;

		        while (true) {
		            System.out.println("Enter a number (0 or negative to stop):");
		            int number = scanner.nextInt();

		            
		            if (number <= 0) {
		                break;
		            }

		            sum += number; // Add positive number to sum
		        }

		        System.out.println("The sum of all entered positive numbers is: " + sum);

		        scanner.close();
		    
	}

}
