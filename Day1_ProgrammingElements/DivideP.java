package Day1_ProgrammingElements;
import java.util.Scanner;
public class DivideP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter the number of chocolates: ");
		        int numberOfChocolates = scanner.nextInt();

		       
		        System.out.print("Enter the number of children: ");
		        int numberOfChildren = scanner.nextInt();

		       
		        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
		        int remainingChocolates = numberOfChocolates % numberOfChildren;

		        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
		                " and the number of remaining chocolates is " + remainingChocolates + ".");

		        scanner.close();
		   

	}

}
