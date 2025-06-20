package java_string_handling;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        
	        Set<Character> charSet = new LinkedHashSet<>();
	        
	       
	        for (char ch : input.toCharArray()) {
	            charSet.add(ch);
	        }
	        
	       
	        StringBuilder result = new StringBuilder();
	        for (char ch : charSet) {
	            result.append(ch);
	        }

	       
	        System.out.println("String after removing duplicates: " + result.toString());
	        
	        scanner.close();
	    

	}

}
