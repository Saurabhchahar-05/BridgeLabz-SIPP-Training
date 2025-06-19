package Day2_controlflow;
import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		      
		        if (number >= 0) {
		            System.out.println(number + " is a natural number.");
		          
		            int sum = number * (number + 1) / 2;
		            System.out.println("Sum of first " + number + " natural numbers is: " + sum);
		        } else {
		            System.out.println(number + " is not a natural number.");
		        }

		        scanner.close();
		    

	}

}
