package buitl_in_function;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	 private static Scanner scanner = new Scanner(System.in);
	    private static Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Think of a number between 1 and 100.");

        int low = 1;
        int high = 100;
        boolean guessed = false;

        while (!guessed && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);
            guessed = processFeedback(guess, feedback, low, high);
        }

        scanner.close();
    }

   
    private static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    
    private static String getUserFeedback(int guess) {
        System.out.println("Is your number higher, lower, or correct? (Enter: high, low, correct)");
        String feedback = scanner.nextLine().trim().toLowerCase();
        while (!feedback.equals("high") && !feedback.equals("low") && !feedback.equals("correct")) {
            System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            feedback = scanner.nextLine().trim().toLowerCase();
        }
        return feedback;
    }

    
    private static boolean processFeedback(int guess, String feedback, int low, int high) {
        switch (feedback) {
            case "correct":
                System.out.println("Great! The computer guessed your number: " + guess);
                return true;
            case "high":
               
                high = guess - 1;
                break;
            case "low":
                
                low = guess + 1;
                break;
        }
       
        return false;
   
		

	}

}
