package java_string_handling;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a string:");
		        String input = scanner.nextLine();

		       
		        char mostFrequentChar = findMostFrequentChar(input);

		       
		        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

		        scanner.close();
		    }

		    public static char findMostFrequentChar(String str) {
		        Map<Character, Integer> frequencyMap = new HashMap<>();

		      
		        for (char ch : str.toCharArray()) {
		            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		        }

		       
		        char mostFrequent = 0;
		        int maxCount = 0;

		        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
		            if (entry.getValue() > maxCount) {
		                maxCount = entry.getValue();
		                mostFrequent = entry.getKey();
		            }
		        }

		        return mostFrequent;
		   

	}

}
