package Day5_string;
import java.util.Scanner;
public class ArrayIndexOutOfBound {
	 public static void generateException(String[] names) {
	        int invalidIndex = names.length; 
	        System.out.println("Attempting to access index " + invalidIndex);
	        String name = names[invalidIndex]; 
	        System.out.println("Name at index " + invalidIndex + ": " + name);
	    }

	   
	    public static void handleException(String[] names) {
	        try {
	            int invalidIndex = names.length; 
	            System.out.println("Attempting to access index " + invalidIndex);
	            String name = names[invalidIndex];
	            System.out.println("Name at index " + invalidIndex + ": " + name);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } catch (RuntimeException e) {
	            System.out.println("Caught general RuntimeException: " + e.getMessage());
	        }
	    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of names:");
        int size = scanner.nextInt();
        String[] names = new String[size];

        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }

      
        System.out.println("\nCalling method to generate ArrayIndexOutOfBoundsException...");
        generateException(names);

        // Call method to handle the exception gracefully
        System.out.println("\nCalling method to handle ArrayIndexOutOfBoundsException...");
        handleException(names);

        scanner.close();
    

	}

}
