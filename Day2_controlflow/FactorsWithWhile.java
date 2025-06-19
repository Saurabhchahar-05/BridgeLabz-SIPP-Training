package Day2_controlflow;
import java.util.Scanner;
public class FactorsWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a positive integer:");
		        int number = scanner.nextInt();

		        
		        if (number <= 0) {
		            System.out.println("Please enter a positive integer.");
		        } else {
		            int counter = 1;

		            System.out.println("Factors of " + number + " are:");
		           
		            while (counter <= number) {
		                if (number % counter == 0) {
		                    System.out.println(counter);
		                }
		                counter++;
		            }
		        }

		        scanner.close();
		   

	}

}
