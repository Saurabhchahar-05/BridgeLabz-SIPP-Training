package Day1_ProgrammingElements;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter the distance in feet: ");
		        double distanceInFeet = scanner.nextDouble();

		       
		        double distanceInYards = distanceInFeet / 3;

		       
		        double distanceInMiles = distanceInYards / 1760;

		        
		        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
		        
		        scanner.close();
		   

	}

}
