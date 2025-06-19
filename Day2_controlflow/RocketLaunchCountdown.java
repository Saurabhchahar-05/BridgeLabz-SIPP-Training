package Day2_controlflow;
import java.util.Scanner;
public class RocketLaunchCountdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter the starting number for the countdown:");
		        int counter = scanner.nextInt();

		       
		        for (int i = counter; i >= 1; i--) {
		            System.out.println(i);
		        }

		        System.out.println("Liftoff! 🚀");

		        scanner.close();
		   

	}

}
