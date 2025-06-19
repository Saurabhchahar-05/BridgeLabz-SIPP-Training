package Day5_string;
import java.util.Scanner;
public class ConvertAndCompare {
	 public static String convertToLowerCase(String str) {
	        StringBuilder lowerStr = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	           
	            if (ch >= 'A' && ch <= 'Z') {
	              
	                ch = (char)(ch + 32);
	            }
	            lowerStr.append(ch);
	        }
	        return lowerStr.toString();
	    }
	    
	   
	    public static boolean compareStrings(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i))
	                return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   

		   
		        Scanner scanner = new Scanner(System.in);
		        
		       
		        System.out.println("Enter the text:");
		        String inputText = scanner.nextLine();

		       
		        String manualLowerCase = convertToLowerCase(inputText);

		       
		        String builtInLowerCase = inputText.toLowerCase();

		       
		        boolean areEqual = compareStrings(manualLowerCase, builtInLowerCase);

		        
		        System.out.println("Lowercase using manual method: " + manualLowerCase);
		        System.out.println("Lowercase using built-in method: " + builtInLowerCase);
		        System.out.println("Are both lowercase texts equal? " + areEqual);

		        scanner.close();
		   

	}

}
