package java_string_handling;
import java.util.Scanner;
public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

       
        System.out.println("Enter the word to replace:");
        String wordToReplace = scanner.nextLine();

      
        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();

      
        String modifiedSentence = replaceWord(sentence, wordToReplace, newWord);

       
        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }

    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
       
        String regex = "\\b" + targetWord + "\\b";
        return sentence.replaceAll(regex, replacementWord);
  

	}

}
