package Day2_controlflow;
import java.util.Scanner;
public class OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a positive integer (Natural Number):");
		        int number = scanner.nextInt();

		        
		        if (number <= 0) {
		            System.out.println("Please enter a positive integer.");
		        } else {
		           
		            for (int i = 1; i <= number; i++) {
		                if (i % 2 == 0) {
		                    System.out.println(i + " is an even number");
		                } else {
		                    System.out.println(i + " is an odd number");
		                }
		            }
		        }

		        scanner.close();
		   
	}

}
