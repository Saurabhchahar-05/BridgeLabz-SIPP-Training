package Day3_array;
import java.util.Scanner;
public class LargestDigit {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter a number: ");
		        long number = scanner.nextLong();

		       
		        int maxDigit = 10;
		        int[] digits = new int[maxDigit];

		       
		        int index = 0;

		        while (number != 0) {
		            int digit = (int)(number % 10);
		            number /= 10;

		           
		            if (index == maxDigit) {
		                maxDigit += 10; // increase size
		                int[] tempDigits = new int[maxDigit];
		                for (int i = 0; i < index; i++) {
		                    tempDigits[i] = digits[i];
		                }
		                digits = tempDigits;
		            }
		            digits[index] = digit;
		            index++;
		        }

		       
		        if (index == 0) {
		            digits[0] = 0;
		            index = 1;
		        }

		       
		        int largest = -1;
		        int secondLargest = -1;

		       
		        for (int i = 0; i < index; i++) {
		            if (digits[i] > largest) {
		                secondLargest = largest;
		                largest = digits[i];
		            } else if (digits[i] > secondLargest && digits[i] != largest) {
		                secondLargest = digits[i];
		            }
		        }

		       
		        if (secondLargest == -1) {
		            System.out.println("There is no second largest digit.");
		        } else {
		            System.out.println("Largest digit: " + largest);
		            System.out.println("Second largest digit: " + secondLargest);
		        }

		        scanner.close();
		  

	}

}
