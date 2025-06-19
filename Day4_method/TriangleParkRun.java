package Day4_method;
import java.util.Scanner;
public class TriangleParkRun {
	  public static int calculateRounds(double side1, double side2, double side3) {
	        double perimeter = side1 + side2 + side3;
	        double totalRunDistance = 5000; 
	       
	        return (int) Math.ceil(totalRunDistance / perimeter);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the sides of the triangular park in meters:");

	        System.out.print("Side 1: ");
	        double side1 = scanner.nextDouble();

	        System.out.print("Side 2: ");
	        double side2 = scanner.nextDouble();

	        System.out.print("Side 3: ");
	        double side3 = scanner.nextDouble();

	        int roundsNeeded = calculateRounds(side1, side2, side3);

	        System.out.println("Number of rounds needed to complete at least 5 km: " + roundsNeeded);

	        scanner.close();
	    }
	}


