package Day1_ProgrammingElements;
import java.util.Scanner;
public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter your height in centimeters: ");
		        double heightCm = input.nextDouble();

		        
		        double inches = heightCm / 2.54;           
		        double feet = (int) (inches / 12);         
		        double remainingInches = inches % 12;      

		        
		        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);

		        input.close();
		    
	}

}
