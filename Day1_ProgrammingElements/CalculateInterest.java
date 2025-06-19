package Day1_ProgrammingElements;
import java.util.Scanner;
public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the Principal amount: ");
		        double principal = scanner.nextDouble();

		        
		        System.out.print("Enter the Rate of Interest (in %): ");
		        double rate = scanner.nextDouble();

		       
		        System.out.print("Enter the Time period (in years): ");
		        double time = scanner.nextDouble();

		       
		        double simpleInterest = (principal * rate * time) / 100;

		       
		        System.out.println("The Simple Interest is " + simpleInterest +
		                " for Principal " + principal +
		                ", Rate of Interest " + rate +
		                " and Time " + time + ".");

		        scanner.close();
		   
	}

}
