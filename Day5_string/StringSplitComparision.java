package Day5_string;
import java.util.Scanner;
public class StringSplitComparision {
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

	    
	    public static String[] customSplit(String text) {
	        int length = getStringLength(text);

	       
	        int wordCount = 0;
	        int[] spaceIndexes = new int[length];
	        spaceIndexes[0] = -1;

	        for (int i = 0; i < length; i++) {
	            if (text.charAt(i) == ' ') {
	                spaceIndexes[++wordCount] = i;
	            }
	        }
	        
	        wordCount = (length == 0) ? 0 : wordCount + 1;

	       
	        String[] words = new String[wordCount];

	       
	        for (int i = 0; i < wordCount; i++) {
	            int start = (i == 0) ? 0 : spaceIndexes[i - 1] + 1;
	            int end = (i == wordCount - 1) ? length : spaceIndexes[i];

	            String word = "";
	            for (int j = start; j < end; j++) {
	                word += text.charAt(j);
	            }
	            words[i] = word;
	        }
	        return words;
	    }

	   
	    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (!arr1[i].equals(arr2[i])) {
	                return false;
	            }
	        }
	        return true;
	    }

	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a text: ");
	        String text = scanner.nextLine();

	      
	        String[] customWords = customSplit(text);

	      
	        String[] builtInWords = text.split(" ");

	       
	        boolean isSame = compareStringArrays(customWords, builtInWords);

	      
	        System.out.println("Words obtained from custom split: ");
	        for (String word : customWords) {
	            System.out.println(word);
	        }

	        System.out.println("\nWords obtained from built-in split(): ");
	        for (String word : builtInWords) {
	            System.out.println(word);
	        }

	        System.out.println("\nAre both arrays equal? " + isSame);

	        scanner.close();
	   
	}

}
