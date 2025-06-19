package Day2_controlflow;
import java.util.Scanner;
public class SumUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        double total = 0.0;
		        double userInput;

		        while (true) {
		            System.out.println("Enter a number (0 to stop):");
		            userInput = scanner.nextDouble();

		            
		            if (userInput == 0) {
		                break;
		            }

		           
		            total += userInput;
		        }

		       
		        System.out.println("Total sum of entered numbers is: " + total);

		        scanner.close();
		   

	}

}
