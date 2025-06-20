package java_string_handling;
import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        String input = scanner.nextLine();

		        StringBuilder toggledString = new StringBuilder();

		       
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		           
		            if (Character.isUpperCase(ch)) {
		                toggledString.append(Character.toLowerCase(ch));
		            }
		          
		            else if (Character.isLowerCase(ch)) {
		                toggledString.append(Character.toUpperCase(ch));
		            }
		            
		            else {
		                toggledString.append(ch);
		            }
		        }

		       
		        System.out.println("Toggled case string: " + toggledString.toString());

		        scanner.close();
		   

	}

}
