package Day3_array;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        
		        number = Math.abs(number);

		       
		        int tempNumber = number;
		        int countDigits = 0;

		        if (tempNumber == 0) {
		            countDigits = 1;
		        } else {
		            while (tempNumber > 0) {
		                countDigits++;
		                tempNumber /= 10;
		            }
		        }

		       
		        int[] digits = new int[countDigits];

		        int index = 0;
		        while (number > 0) {
		            digits[index] = number % 10;
		            number /= 10;
		            index++;
		        }

		       
		        System.out.println("Digits in reverse order:");
		        for (int i = countDigits - 1; i >= 0; i--) {
		            System.out.print(digits[i] + " ");
		        }
		        System.out.println();

		        scanner.close();
		   

	}

}
