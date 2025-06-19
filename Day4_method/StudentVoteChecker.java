package Day4_method;
import java.util.Scanner;
public class StudentVoteChecker {
	 public boolean canStudentVote(int age) {
	        if (age < 0) {
	           
	            return false;
	        }
	        return age >= 18; 
	    }
	
       

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
	        StudentVoteChecker voteChecker = new StudentVoteChecker();
	        int[] ages = new int[10];

	       
	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = scanner.nextInt();

	           
	            boolean canVote = voteChecker.canStudentVote(ages[i]);
	            if (ages[i] < 0) {
	                System.out.println("Invalid age entered. Cannot determine voting eligibility.");
	            } else if (canVote) {
	                System.out.println("Student " + (i + 1) + " can vote.");
	            } else {
	                System.out.println("Student " + (i + 1) + " cannot vote.");
	            }
	        }

	        scanner.close();
		
	           
	    

	}

}
