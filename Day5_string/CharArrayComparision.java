package Day5_string;
import java.util.Arrays;
import java.util.Scanner;
public class CharArrayComparision {
	public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

   
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Enter a string:");
	        String inputString = scanner.next();

	       
	        char[] userDefinedChars = getCharacters(inputString);
	        
	       
	        char[] builtInChars = inputString.toCharArray();
	        
	       
	        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
	        
	        
	        System.out.println("Characters from user-defined method: " + Arrays.toString(userDefinedChars));
	        System.out.println("Characters from toCharArray() method: " + Arrays.toString(builtInChars));
	        System.out.println("Are both character arrays equal? " + areEqual);

	        scanner.close();
		
		// TODO Auto-generated method stub

	}

}
