package Day5_string;
import java.util.Scanner;
public class WordWithLength {
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
        int wordCount = 0;
        int[] spaceIndexes = new int[length + 1]; 
        spaceIndexes[0] = -1; 
        int indexCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[++indexCount] = i;
            }
        }
       
        int totalWords = (length == 0) ? 0 : indexCount + 1;
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
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = getStringLength(words[i]);
            String lengthStr = String.valueOf(len);
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = lengthStr;
        }
        return wordLengthArray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a text:");
		        String inputText = scanner.nextLine();

		      
		        String[] words = splitTextIntoWords(inputText);

		        
		        String[][] wordsWithLengths = createWordsWithLengths(words);

		       
		        System.out.println("Word\tLength");
		        for (int i = 0; i < wordsWithLengths.length; i++) {
		          
		            int length = Integer.parseInt(wordsWithLengths[i][1]);
		            System.out.println(wordsWithLengths[i][0] + "\t" + length);
		        }

		        scanner.close();
		   

	}

}
