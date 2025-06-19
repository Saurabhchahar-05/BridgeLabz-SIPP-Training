package Day1_ProgrammingElements;
import java.util.Scanner;

public class TotalIncome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.print("Enter your salary in INR: ");
		        double salary = scanner.nextDouble();

		       
		        System.out.print("Enter your bonus in INR: ");
		        double bonus = scanner.nextDouble();

		      
		        double totalIncome = salary + bonus;

		      
		        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome + ".");

		        scanner.close();
		   

	}

}
