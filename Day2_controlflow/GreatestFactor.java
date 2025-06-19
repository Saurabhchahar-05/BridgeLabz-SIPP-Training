package Day2_controlflow;
import java.util.Scanner;
public class GreatestFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter an integer:");
		        int number = scanner.nextInt();

		        int greatestFactor = 1; 
		        int counter = number - 1; 

		      
		        while (counter >= 1) {
		            if (number % counter == 0) {
		                greatestFactor = counter;
		                break;
		            }
		            counter--;
		        }

		       
		        System.out.println("The greatest factor of " + number + " aside from itself is: " + greatestFactor);

		        scanner.close();
		   

	}

}
