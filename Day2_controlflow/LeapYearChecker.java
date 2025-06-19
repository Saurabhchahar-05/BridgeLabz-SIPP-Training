package Day2_controlflow;
import java.util.Scanner;
public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter a year (>= 1582): ");
		        int year = scanner.nextInt();

		       
		        if (year < 1582) {
		            System.out.println("Year should be greater than or equal to 1582 for Gregorian calendar.");
		        } else {
		           
		            if (year % 400 == 0) {
		                System.out.println(year + " is a Leap Year.");
		            } else if (year % 100 == 0) {
		                System.out.println(year + " is not a Leap Year.");
		            } else if (year % 4 == 0) {
		                System.out.println(year + " is a Leap Year.");
		            } else {
		                System.out.println(year + " is not a Leap Year.");
		            }
		        }

		        scanner.close();
		    
	}

}
