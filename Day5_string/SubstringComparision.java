package Day5_string;
import java.util.Scanner;
public class SubstringComparision {
	  public static String createSubstringUsingCharAt(String str, int start, int end) {
	        StringBuilder result = new StringBuilder();
	        for (int i = start; i < end; i++) {
	            result.append(str.charAt(i));
	        }
	        return result.toString();
	    }
	    
	   
	    public static boolean compareStringsUsingCharAt(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		
		

		  
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter the string:");
		        String inputString = scanner.nextLine();
		        
		        
		        System.out.println("Enter the start index:");
		        int startIndex = scanner.nextInt();
		        
		        System.out.println("Enter the end index:");
		        int endIndex = scanner.nextInt();

		        
		        String substringCharAt = createSubstringUsingCharAt(inputString, startIndex, endIndex);
		        String substringBuiltIn = inputString.substring(startIndex, endIndex);
		        
		        
		        boolean areEqual = compareStringsUsingCharAt(substringCharAt, substringBuiltIn);
		        
		       
		        System.out.println("Substring using charAt(): " + substringCharAt);
		        System.out.println("Substring using substring(): " + substringBuiltIn);
		        System.out.println("Are both substrings equal? " + areEqual);
		        
		        scanner.close();
		  

	}

}
