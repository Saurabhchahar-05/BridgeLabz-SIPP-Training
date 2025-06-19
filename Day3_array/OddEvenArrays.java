package Day3_array;
import java.util.Scanner;
public class OddEvenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter a natural number: ");
		        int number = scanner.nextInt();

		        if (number <= 0) {
		            System.out.println("Error: The number is not a natural number. Program will exit.");
		            scanner.close();
		            return;
		        }

		       
		        int size = number / 2 + 1;
		        int[] evenNumbers = new int[size];
		        int[] oddNumbers = new int[size];

		       
		        int evenIndex = 0;
		        int oddIndex = 0;

		       
		        for (int i = 1; i <= number; i++) {
		            if (i % 2 == 0) {
		              
		                evenNumbers[evenIndex] = i;
		                evenIndex++;
		            } else {
		                // Odd number
		                oddNumbers[oddIndex] = i;
		                oddIndex++;
		            }
		        }

		       
		        System.out.println("Odd numbers:");
		        for (int i = 0; i < oddIndex; i++) {
		            System.out.print(oddNumbers[i] + " ");
		        }
		        System.out.println();

		       
		        System.out.println("Even numbers:");
		        for (int i = 0; i < evenIndex; i++) {
		            System.out.print(evenNumbers[i] + " ");
		        }
		        System.out.println();

		        scanner.close();
		   
		 
	}

}
