package buitl_in_function;
import java.time.LocalDate;
import java.util.Scanner;
public class DateArthimetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter a date (yyyy-MM-dd): ");
	        String inputDate = scanner.nextLine();

	        try {
	           
	            LocalDate date = LocalDate.parse(inputDate);

	           
	            LocalDate newDate = date.plusDays(7)
	                                     .plusMonths(1)
	                                     .plusYears(2);

	          
	            newDate = newDate.minusWeeks(3);

	           
	            System.out.println("Resulting date after operations: " + newDate);
	        } catch (Exception e) {
	            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
	        }
	        
	        scanner.close();
	   

	}

}
