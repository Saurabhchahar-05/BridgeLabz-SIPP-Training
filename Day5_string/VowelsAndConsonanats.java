package Day5_string;
import java.util.Scanner;
public class VowelsAndConsonanats {
	 public static String checkCharType(char ch) {
	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	          
	            ch = (char) (ch >= 'A' && ch <= 'Z' ? ch + 32 : ch);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                return "Vowel";
	            } else {
	                return "Consonant";
	            }
	        } else {
	            return "Not a Letter";
	        }
	    }

	  
	    public static int[] countVowelsAndConsonants(String str) {
	        int vowelsCount = 0;
	        int consonantsCount = 0;
	        for (int i = 0; i < str.length(); i++) {
	            String result = checkCharType(str.charAt(i));
	            if (result.equals("Vowel")) {
	                vowelsCount++;
	            } else if (result.equals("Consonant")) {
	                consonantsCount++;
	            }
	        }
	        return new int[]{vowelsCount, consonantsCount};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(input);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    


	}

}
