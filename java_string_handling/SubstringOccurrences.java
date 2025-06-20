package java_string_handling;
import java.util.Scanner;

public class SubstringOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the main string:");
		        String str = scanner.nextLine();

		        System.out.println("Enter the substring to find:");
		        String subStr = scanner.nextLine();

		        int count = 0;
		        int index = 0;

		       
		        while ((index = str.indexOf(subStr, index)) != -1) {
		            count++;
		            index += 1; 
		        }

		        System.out.println("The substring '" + subStr + "' occurs " + count + " times in the string.");

		        scanner.close();
		  

	}

}
