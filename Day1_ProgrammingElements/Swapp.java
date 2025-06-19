package Day1_ProgrammingElements;
import java.util.Scanner;
public class Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter the first number: ");
		        int number1 = scanner.nextInt();

		       
		        System.out.print("Enter the second number: ");
		        int number2 = scanner.nextInt();

		       
		        int temp = number1;
		        number1 = number2;
		        number2 = temp;

		       
		        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");

		        scanner.close();
		    
	}

}
