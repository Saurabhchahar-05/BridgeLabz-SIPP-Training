package Day4_method;
import java.util.Scanner;
public class HandShakeCalculator {
	 public static int calculateHandshakes(int numberOfStudents) {
	        return (numberOfStudents * (numberOfStudents - 1)) / 2;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of students: ");
		        int numberOfStudents = scanner.nextInt();

		        int maxHandshakes = calculateHandshakes(numberOfStudents);

		        System.out.println("Maximum number of handshakes possible: " + maxHandshakes);

		        scanner.close();
		    

	}

}
