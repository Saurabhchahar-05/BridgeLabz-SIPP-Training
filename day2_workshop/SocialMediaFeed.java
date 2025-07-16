package day2_workshop;
import java.util.LinkedList;


abstract class Notification {
 String message;
 Notification(String message) {
     this.message = message;
 }
 abstract void display();
}

class LikeNotification extends Notification {
 LikeNotification(String user) {
     super(user + " liked your post");
 }
 void display() {
     System.out.println("r " + message);
 }
}

class CommentNotification extends Notification {
 CommentNotification(String user, String comment) {
     super(user + " commented: " + comment);
 }
 void display() {
     System.out.println("l" + message);
 }
}


class UserFeed {
 private LinkedList<Notification> feed = new LinkedList<>();
 public void addNotification(Notification n) {
     feed.addFirst(n); 
 }

 public void displayFeed() {
     System.out.println("Your notification feed:");
     for (Notification n : feed) {
         n.display();
     }
 }
}

public class SocialMediaFeed {
 public static void main(String[] args) {
     UserFeed userFeed = new UserFeed();
     userFeed.addNotification(new LikeNotification("Alice"));
     userFeed.addNotification(new CommentNotification("Bob", "Nice photo!"));
     userFeed.addNotification(new LikeNotification("Charlie"));

     userFeed.displayFeed(); 
 }
}

