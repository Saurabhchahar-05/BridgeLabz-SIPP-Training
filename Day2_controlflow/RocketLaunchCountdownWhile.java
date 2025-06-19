package Day2_controlflow;
import java.util.Scanner;

public class RocketLaunchCountdownWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Enter the starting number for the countdown:");
		        int counter = scanner.nextInt();

		       
		        while (counter >= 1) {
		            System.out.println(counter);
		            counter--; 
		        }

		        System.out.println("Liftoff! 🚀");

		        scanner.close();
		   

	}

}
