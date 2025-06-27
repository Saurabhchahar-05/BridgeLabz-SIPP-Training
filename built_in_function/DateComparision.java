package buitl_in_function;
import java.time.LocalDate;
import java.util.Scanner;
public class DateComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first date (yyyy-MM-dd): ");
	        String firstDateInput = scanner.nextLine();

	       
	        System.out.print("Enter the second date (yyyy-MM-dd): ");
	        String secondDateInput = scanner.nextLine();

	        try {
	           
	            LocalDate date1 = LocalDate.parse(firstDateInput);
	            LocalDate date2 = LocalDate.parse(secondDateInput);

	            
	            if (date1.isBefore(date2)) {
	                System.out.println("The first date is before the second date.");
	            } else if (date1.isAfter(date2)) {
	                System.out.println("The first date is after the second date.");
	            } else if (date1.isEqual(date2)) {
	                System.out.println("Both dates are the same.");
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please enter dates in yyyy-MM-dd format.");
	        }

	        scanner.close();
	   
	}

}
