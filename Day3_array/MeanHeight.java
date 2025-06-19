package Day3_array;
import java.util.Scanner;

public class MeanHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        double[] heights = new double[11];

		       
		        System.out.println("Enter the heights of 11 players in centimeters:");
		        for (int i = 0; i < heights.length; i++) {
		            System.out.print("Player " + (i + 1) + ": ");
		            heights[i] = scanner.nextDouble();
		        }

		       
		        double sum = 0;
		        for (double height : heights) {
		            sum += height;
		        }

		      
		        double meanHeight = sum / heights.length;

		       
		        System.out.printf("The mean height of the players is: %.2f cm%n", meanHeight);

		        scanner.close();
		   
	}

}
