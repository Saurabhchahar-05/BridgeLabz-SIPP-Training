package Day2_controlflow;
import java.util.Scanner;
public class DivisibleByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		       
		        if (number % 5 == 0) {
		            System.out.println("Is the number " + number + " divisible by 5? Yes");
		        } else {
		            System.out.println("Is the number " + number + " divisible by 5? No");
		        }

		        scanner.close();
		   

	}

}
