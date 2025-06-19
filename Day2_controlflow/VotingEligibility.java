package Day2_controlflow;
import java.util.Scanner;
public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter the person's age:");
		        int age = scanner.nextInt();

		       
		        if (age >= 18) {
		            System.out.println("The person's age is " + age + " and can vote.");
		        } else {
		            System.out.println("The person's age is " + age + " and cannot vote.");
		        }

		        scanner.close();
		  
	}

}
