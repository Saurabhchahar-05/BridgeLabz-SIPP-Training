package Day3_array;
import java.util.Scanner;
public class BMIAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the number of persons: ");
		        int number = scanner.nextInt();

		        double[][] personData = new double[number][3];
		        String[] weightStatus = new String[number];

		       
		        for (int i = 0; i < number; i++) {
		            System.out.println("\nEnter details for person " + (i + 1) + ":");
		           
		            do {
		                System.out.print("Height in meters (positive value): ");
		                personData[i][0] = scanner.nextDouble();
		                if (personData[i][0] <= 0) {
		                    System.out.println("Please enter a positive height value.");
		                }
		            } while (personData[i][0] <= 0);

		           
		            do {
		                System.out.print("Weight in kilograms (positive value): ");
		                personData[i][1] = scanner.nextDouble();
		                if (personData[i][1] <= 0) {
		                    System.out.println("Please enter a positive weight value.");
		                }
		            } while (personData[i][1] <= 0);
		        }

		       
		        for (int i = 0; i < number; i++) {
		            double height = personData[i][0];
		            double weight = personData[i][1];

		           
		            double bmi = weight / (height * height);
		            personData[i][2] = bmi;

		           
		            if (bmi < 18.5) {
		                weightStatus[i] = "Underweight";
		            } else if (bmi >= 18.5 && bmi < 25) {
		                weightStatus[i] = "Normal";
		            } else if (bmi >= 25 && bmi < 30) {
		                weightStatus[i] = "Overweight";
		            } else {
		                weightStatus[i] = "Obese";
		            }
		        }

		        
		        System.out.println("\n--- BMI Report ---");
		        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
		        for (int i = 0; i < number; i++) {
		            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
		                personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
		        }

		        scanner.close();
		   

	}

}
