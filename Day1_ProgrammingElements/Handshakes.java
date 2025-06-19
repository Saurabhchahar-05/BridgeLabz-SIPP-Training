package Day1_ProgrammingElements;
import java.util.Scanner;
public class Handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter the number of students: ");
		        int numberOfStudents = scanner.nextInt();

		      
		        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

		     
		        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes + ".");

		        scanner.close();
		   
	}

}
