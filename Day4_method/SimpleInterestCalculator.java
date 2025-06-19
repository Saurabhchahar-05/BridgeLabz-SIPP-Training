package Day4_method;
import java.util.Scanner;
public class SimpleInterestCalculator {
	public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

      
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        
        System.out.println("The Simple Interest is " + simpleInterest 
            + " for Principal " + principal 
            + ", Rate of Interest " + rate 
            + "% and Time " + time + " years.");

        scanner.close();
    

	}

}
