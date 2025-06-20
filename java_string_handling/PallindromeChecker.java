package java_string_handling;
import java.util.Scanner;
public class PallindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter a string to check if it is a palindrome:");
		        String input = scanner.nextLine();
		        
		        // Remove spaces and convert to lowercase for accurate checking
		        String processedString = input.replaceAll("\\s+", "").toLowerCase();
		        String reversed = "";

		        // Reverse the string manually
		        for (int i = processedString.length() - 1; i >= 0; i--) {
		            reversed += processedString.charAt(i);
		        }

		        // Check if original and reversed are the same
		        if (processedString.equals(reversed)) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }

		        scanner.close();
		   

	}

}
