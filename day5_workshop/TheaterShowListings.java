package day5_workshop;
import java.util.ArrayList;

class Show {
    String title;
    String time; 

    Show(String title, String time) {
        this.title = title;
        this.time = time;
    }
}

public class TheaterShowListings {
    static ArrayList<Show> shows = new ArrayList<>();

    public static void addShow(String title, String time) {
        Show newShow = new Show(title, time);
        shows.add(newShow);
        

        int i = shows.size() - 1;
        while (i > 0 && shows.get(i).time.compareTo(shows.get(i - 1).time) < 0) {
            Show temp = shows.get(i);
            shows.set(i, shows.get(i - 1));
            shows.set(i - 1, temp);
            i--;
        }
    }

    public static void printShows() {
        System.out.println("Upcoming Shows:");
        for (Show show : shows) {
            System.out.println(show.time + " - " + show.title);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter show details. Type 'exit' as title to finish.");
        while (true) {
            System.out.print("Enter show title: ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter show time (HH:MM): ");
            String time = scanner.nextLine();
            addShow(title, time);
        }
        scanner.close();
        printShows();
    }
}


