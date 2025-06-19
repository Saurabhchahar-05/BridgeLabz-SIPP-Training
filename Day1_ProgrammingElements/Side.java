package Day1_ProgrammingElements;
import java.util.Scanner;
public class Side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		       
		        System.out.print("Enter the perimeter of the square: ");
		        double perimeter = input.nextDouble();

		      
		        double side = perimeter / 4;

		       
		        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

		        input.close();
		   

	}

}
