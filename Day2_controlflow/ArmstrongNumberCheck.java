package Day2_controlflow;
import java.util.Scanner;
public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        int originalNumber = number; 
		        int sum = 0; 

		        
		        while (originalNumber != 0) {
		           
		            int digit = originalNumber % 10;
		            
		            sum += Math.pow(digit, 3);
		           
		            originalNumber /= 10;
		        }

		        
		        if (sum == number) {
		            System.out.println(number + " is an Armstrong Number.");
		        } else {
		            System.out.println(number + " is not an Armstrong Number.");
		        }

		        scanner.close();
		   

	}

}
