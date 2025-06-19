package Day5_string;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	 enum Choice {
	        ROCK, PAPER, SCISSORS
	    }

	  
	    public static Choice getComputerChoice() {
	        Random rand = new Random();
	        int choiceNum = rand.nextInt(3);
	        return Choice.values()[choiceNum];
	    }

	   
	    public static int determineWinner(Choice userChoice, Choice computerChoice) {
	        if (userChoice == computerChoice) {
	            return 0; // Tie
	        }
	        switch (userChoice) {
	            case ROCK:
	                return (computerChoice == Choice.SCISSORS) ? 1 : -1;
	            case PAPER:
	                return (computerChoice == Choice.ROCK) ? 1 : -1;
	            case SCISSORS:
	                return (computerChoice == Choice.PAPER) ? 1 : -1;
	            default:
	                return 0;
	        }
	    }

	   
	    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
	        String[][] stats = new String[3][2];

	        double userWinPercent = totalGames == 0 ? 0 : (userWins * 100.0) / totalGames;
	        double computerWinPercent = totalGames == 0 ? 0 : (computerWins * 100.0) / totalGames;

	        stats[0][0] = "Player Wins";
	        stats[0][1] = Integer.toString(userWins);

	        stats[1][0] = "Computer Wins";
	        stats[1][1] = Integer.toString(computerWins);

	        stats[2][0] = "Player Win Percentage";
	        stats[2][1] = String.format("%.2f%%", userWinPercent);

	        return stats;
	    }

	   
	    public static void displayGameResult(int gameNumber, Choice userChoice, Choice computerChoice, int winner) {
	        System.out.println("Game " + gameNumber + ":");
	        System.out.println("User choice: " + userChoice);
	        System.out.println("Computer choice: " + computerChoice);
	        if (winner == 1) {
	            System.out.println("Result: User wins!\n");
	        } else if (winner == -1) {
	            System.out.println("Result: Computer wins!\n");
	        } else {
	            System.out.println("Result: It's a tie!\n");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of games to play: ");
	        int totalGames = scanner.nextInt();

	        int userWins = 0;
	        int computerWins = 0;

	        for (int i = 1; i <= totalGames; i++) {
	            System.out.print("Game " + i + " - Enter your choice (rock, paper, scissors): ");
	            String userInput = scanner.next().toLowerCase();
	            Choice userChoice;

	            switch (userInput) {
	                case "rock":
	                    userChoice = Choice.ROCK;
	                    break;
	                case "paper":
	                    userChoice = Choice.PAPER;
	                    break;
	                case "scissors":
	                    userChoice = Choice.SCISSORS;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Defaulting to 'rock'.");
	                    userChoice = Choice.ROCK;
	            }

	            Choice computerChoice = getComputerChoice();
	            int winner = determineWinner(userChoice, computerChoice);

	            if (winner == 1) {
	                userWins++;
	            } else if (winner == -1) {
	                computerWins++;
	            }

	            displayGameResult(i, userChoice, computerChoice, winner);
	        }

	        String[][] stats = calculateStats(userWins, computerWins, totalGames);

	        System.out.println("Summary of all games:");
	        for (String[] stat : stats) {
	            System.out.println(stat[0] + ": " + stat[1]);
	        }

	        scanner.close();
	    
	}

}
