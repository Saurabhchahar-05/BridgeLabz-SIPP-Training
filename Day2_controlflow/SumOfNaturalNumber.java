package Day2_controlflow;
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter a positive integer (natural number):");
		        int n = scanner.nextInt();

		       
		        if (n <= 0) {
		            System.out.println("Please enter a positive (natural) number.");
		        } else {
		            int sumLoop = 0;
		            int i = 1;

		           
		            while (i <= n) {
		                sumLoop += i;
		                i++;
		            }

		           
		            int sumFormula = n * (n + 1) / 2;

		           
		            System.out.println("Sum using while loop: " + sumLoop);
		            System.out.println("Sum using formula: " + sumFormula);

		          
		            if (sumLoop == sumFormula) {
		                System.out.println("Both results match. The calculations are correct.");
		            } else {
		                System.out.println("Results do not match. There might be an error.");
		            }
		        }

		        scanner.close();
		  

	}

}
