package Day5_string;

public class NumberFormatExceptionDemo {
	  public static void generateNumberFormatException(String text) {
	       
	        int number = Integer.parseInt(text);
	        System.out.println("Parsed number: " + number);
	    }

	    
	    public static void handleNumberFormatException(String text) {
	        try {
	            int number = Integer.parseInt(text);
	            System.out.println("Parsed number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Caught NumberFormatException: " + e.getMessage());
	        } catch (RuntimeException e) {
	           
	            System.out.println("Caught RuntimeException: " + e.getMessage());
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String invalidInput = "abc";

	       
	        try {
	            generateNumberFormatException(invalidInput);
	        } catch (NumberFormatException e) {
	            System.out.println("Exception caught in main: " + e.getMessage());
	        }

	        System.out.println("\nRefactored to handle exception with try-catch:");
	       
	        handleNumberFormatException(invalidInput);

	}

}
