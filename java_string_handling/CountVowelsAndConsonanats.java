package java_string_handling;
import java.util.Scanner;
public class CountVowelsAndConsonanats {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase to simplify checks
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        // Display the counts
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);

        scanner.close();
    

	}

}
