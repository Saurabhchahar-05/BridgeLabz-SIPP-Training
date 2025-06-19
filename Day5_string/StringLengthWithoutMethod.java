package Day5_string;
import java.util.Scanner;
public class StringLengthWithoutMethod {
	 public static int getStringLength(String str) {
	        int count = 0;
	        try {
	            while (true) {
	                
	                str.charAt(count);
	                count++;
	            }
	        } catch (IndexOutOfBoundsException e) {
	            
	            return count;
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String userInput = scanner.next();

	        int lengthUsingMethod = userInput.length();
	        int lengthWithoutMethod = getStringLength(userInput);

	        System.out.println("Length using built-in method: " + lengthUsingMethod);
	        System.out.println("Length without using length(): " + lengthWithoutMethod);

	}

}
