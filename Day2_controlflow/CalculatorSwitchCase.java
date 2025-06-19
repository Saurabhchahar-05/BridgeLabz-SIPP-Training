package Day2_controlflow;
import java.util.Scanner;
public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        double first, second;
		        String op;

		        
		        System.out.print("Enter the first number: ");
		        first = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        second = scanner.nextDouble();

		        System.out.print("Enter an operator (+, -, *, /): ");
		        op = scanner.next();

		       
		        double result = 0;
		        boolean validOperator = true;

		        
		        switch (op) {
		            case "+":
		                result = first + second;
		                break;
		            case "-":
		                result = first - second;
		                break;
		            case "*":
		                result = first * second;
		                break;
		            case "/":
		                if (second != 0) {
		                    result = first / second;
		                } else {
		                    System.out.println("Error: Division by zero is not allowed.");
		                    validOperator = false;
		                }
		                break;
		            default:
		                System.out.println("Invalid Operator");
		                validOperator = false;
		        }

		       
		        if (validOperator) {
		            System.out.println("Result: " + result);
		        }

		        scanner.close();
		   

	}

}
