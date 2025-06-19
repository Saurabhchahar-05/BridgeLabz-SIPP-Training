package Day5_string;
import java.util.Scanner;
public class ShortestLongestWord {
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

	  
	    public static String[] splitTextIntoWords(String text) {
	        int length = getStringLength(text);
	        int[] spaceIndexes = new int[length + 1]; 
	        spaceIndexes[0] = -1;
	        int spaceCount = 0;

	     
	        for (int i = 0; i < length; i++) {
	            if (text.charAt(i) == ' ') {
	                spaceIndexes[++spaceCount] = i;
	            }
	        }

	        int totalWords = (length == 0) ? 0 : spaceCount + 1;
	        String[] words = new String[totalWords];

	       
	        for (int i = 0; i < totalWords; i++) {
	            int start = (i == 0) ? 0 : spaceIndexes[i - 1] + 1;
	            int end = (i == totalWords - 1) ? length : spaceIndexes[i];

	            String word = "";
	            for (int j = start; j < end; j++) {
	                word += text.charAt(j);
	            }
	            words[i] = word;
	        }
	        return words;
	    }

	   
	    public static String[][] createWordsWithLengths(String[] words) {
	        String[][] result = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            int len = getStringLength(words[i]);
	            result[i][0] = words[i];
	            result[i][1] = String.valueOf(len);
	        }
	        return result;
	    }

	   
	    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
	        if (wordsWithLengths.length == 0)
	            return new int[]{-1, -1}; 

	        int minIndex = 0;
	        int maxIndex = 0;

	        for (int i = 1; i < wordsWithLengths.length; i++) {
	            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
	            int minLength = Integer.parseInt(wordsWithLengths[minIndex][1]);
	            int maxLength = Integer.parseInt(wordsWithLengths[maxIndex][1]);

	            if (currentLength < minLength) {
	                minIndex = i;
	            }
	            if (currentLength > maxLength) {
	                maxIndex = i;
	            }
	        }

	        return new int[]{minIndex, maxIndex};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a text:");
	        String text = scanner.nextLine();

	      
	        String[] words = splitTextIntoWords(text);

	        
	        String[][] wordsWithLengths = createWordsWithLengths(words);

	       
	        int[] indices = findShortestAndLongest(wordsWithLengths);
	        int shortestIdx = indices[0];
	        int longestIdx = indices[1];

	      
	        System.out.println("Words and their lengths:");
	        for (String[] pair : wordsWithLengths) {
	            System.out.println(pair[0] + " | Length: " + Integer.parseInt(pair[1]));
	        }

	        if (shortestIdx != -1 && longestIdx != -1) {
	            System.out.println("\nShortest word: " + wordsWithLengths[shortestIdx][0]);
	            System.out.println("Longest word: " + wordsWithLengths[longestIdx][0]);
	        } else {
	            System.out.println("No words found.");
	        }

	        scanner.close();
	    }

	}


