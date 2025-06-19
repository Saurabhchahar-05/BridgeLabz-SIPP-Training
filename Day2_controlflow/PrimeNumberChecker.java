package Day2_controlflow;
import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter an integer greater than 1: ");
		        int number = scanner.nextInt();

		        
		        boolean isPrime = true;

		       
		        if (number <= 1) {
		            System.out.println("Number should be greater than 1 to check for prime.");
		        } else {
		           
		            for (int i = 2; i <= number - 1; i++) {
		                if (number % i == 0) {
		                   
		                    isPrime = false;
		                    break; 
		                }
		            }

		           
		            if (isPrime) {
		                System.out.println(number + " is a Prime Number.");
		            } else {
		                System.out.println(number + " is not a Prime Number.");
		            }
		        }

		        scanner.close();
		    

	}

}
