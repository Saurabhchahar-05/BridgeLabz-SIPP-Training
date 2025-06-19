package Day2_controlflow;
import java.util.Scanner;
public class MultipleBelow100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Enter a positive integer less than 100:");
		        int number = scanner.nextInt();

		       
		        if (number <= 0 || number >= 100) {
		            System.out.println("Please enter a positive integer less than 100.");
		        } else {
		            
		            for (int i = 100; i >= 1; i--) {
		                
		                if (i % number == 0) {
		                    System.out.println(i + " is a multiple of " + number);
		                }
		            }
		        }

		        scanner.close();
		   

	}

}
