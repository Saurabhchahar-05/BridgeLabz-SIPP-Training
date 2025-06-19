package Day1_ProgrammingElements;
import java.util.Scanner;
public class ConvertDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter from city: ");
		        String fromCity = scanner.nextLine();

		        System.out.print("Enter via city: ");
		        String viaCity = scanner.nextLine();

		        System.out.print("Enter to city: ");
		        String toCity = scanner.nextLine();

		      
		        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in Miles: ");
		        double fromToViaMiles = scanner.nextDouble();

		        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in Miles: ");
		        double viaToFinalMiles = scanner.nextDouble();

		        // Taking time in minutes
		        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " in minutes: ");
		        double timeFromToVia = scanner.nextDouble();

		        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " in minutes: ");
		        double timeViaToFinal = scanner.nextDouble();

		     
		        double totalDistanceMiles = fromToViaMiles + viaToFinalMiles;
		        double totalTimeMinutes = timeFromToVia + timeViaToFinal;

		        
		        double totalDistanceKm = totalDistanceMiles * 1.60934;

		       
		        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
		                " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTimeMinutes + " minutes.");

		        scanner.close();
		   

	}

}
