package java_string_handling;
import java.util.Scanner;
public class LongestWordFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter a sentence:");
		        String sentence = scanner.nextLine();
		        
		        
		        String[] words = sentence.split("\\s+");
		        
		        String longestWord = "";
		        int maxLength = 0;

		       
		        for (String word : words) {
		            if (word.length() > maxLength) {
		                maxLength = word.length();
		                longestWord = word;
		            }
		        }

		       
		        System.out.println("The longest word is: " + longestWord);
		        
		        scanner.close();
		    

	}

}
