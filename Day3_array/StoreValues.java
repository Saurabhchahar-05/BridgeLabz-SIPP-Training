package Day3_array;
import java.util.Scanner;

public class StoreValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        double[] numbers = new double[10];
		        double total = 0.0;
		        int index = 0;

		       
		        while (true) {
		            System.out.print("Enter a positive number (or 0/negative to stop): ");
		            double input = scanner.nextDouble();

		           
		            if (input <= 0 || index == 10) {
		                break;
		            }

		            
		            numbers[index] = input;
		            index++;
		        }

		       
		        for (int i = 0; i < index; i++) {
		            total += numbers[i];
		        }

		       
		        System.out.println("Numbers entered:");
		        for (int i = 0; i < index; i++) {
		            System.out.print(numbers[i] + " ");
		        }
		        System.out.println("\nTotal of all numbers: " + total);

		        scanner.close();
		   
	}

}
