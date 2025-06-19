package Day3_array;
import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the number of persons: ");
		        int numberOfPersons = scanner.nextInt();

		       
		        double[] heights = new double[numberOfPersons];   
		        double[] weights = new double[numberOfPersons];   
		        double[] bmis = new double[numberOfPersons];
		        String[] statuses = new String[numberOfPersons];

		       
		        for (int i=0; i < numberOfPersons; i++) {
		            System.out.println("\nEnter details for person " + (i+1) + ":");
		            do {
		                System.out.print("Height in meters (positive value): ");
		                heights[i] = scanner.nextDouble();
		                if (heights[i] <= 0) {
		                    System.out.println("Invalid input! Height must be positive.");
		                }
		            } while (heights[i] <= 0);

		            do {
		                System.out.print("Weight in kilograms (positive value): ");
		                weights[i] = scanner.nextDouble();
		                if (weights[i] <= 0) {
		                    System.out.println("Invalid input! Weight must be positive.");
		                }
		            } while (weights[i] <= 0);
		        }

		       
		        for (int i=0; i < numberOfPersons; i++) {
		            bmis[i] = weights[i] / (heights[i] * heights[i]);

		            
		            if (bmis[i] < 18.5) {
		                statuses[i] = "Underweight";
		            } else if (bmis[i] >= 18.5 && bmis[i] < 25) {
		                statuses[i] = "Normal weight";
		            } else if (bmis[i] >= 25 && bmis[i] < 30) {
		                statuses[i] = "Overweight";
		            } else {
		                statuses[i] = "Obese";
		            }
		        }

		      
		        System.out.println("\n--- BMI Report ---");
		        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height", "Weight", "BMI", "Status");
		        for (int i=0; i < numberOfPersons; i++) {
		            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
		                    heights[i], weights[i], bmis[i], statuses[i]);
		        }

		        scanner.close();
		   
	}

}
