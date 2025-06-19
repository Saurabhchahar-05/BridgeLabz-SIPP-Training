package Day5_string;
import java.util.Scanner;
public class StringIndexOutOfBound {
	 public static void generateException(String str, int index) {
	        System.out.println("Attempting to access index " + index + " in the string...");
	       
	        char ch = str.charAt(index);
	        System.out.println("Character at index " + index + ": " + ch);
	    }

	   
	    public static void handleException(String str, int index) {
	        try {
	            System.out.println("Trying to access index " + index + " in the string...");
	            char ch = str.charAt(index);
	            System.out.println("Character at index " + index + ": " + ch);
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	            System.out.println("Invalid index. Please enter an index within the string length.");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter a string:");
		        String inputString = scanner.nextLine();
		        
		       
		        System.out.println("Enter an index to access (beyond the length to cause exception):");
		        int index = scanner.nextInt();

		       
		        generateException(inputString, index);

		       
		        handleException(inputString, index);

		        scanner.close();
		   
	}

}
