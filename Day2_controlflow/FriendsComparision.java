package Day2_controlflow;
import java.util.Scanner;
public class FriendsComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter Amar's age:");
		        int ageAmar = scanner.nextInt();
		        System.out.println("Enter Amar's height (in cm):");
		        int heightAmar = scanner.nextInt();

		       
		        System.out.println("Enter Akbar's age:");
		        int ageAkbar = scanner.nextInt();
		        System.out.println("Enter Akbar's height (in cm):");
		        int heightAkbar = scanner.nextInt();

		        
		        System.out.println("Enter Anthony's age:");
		        int ageAnthony = scanner.nextInt();
		        System.out.println("Enter Anthony's height (in cm):");
		        int heightAnthony = scanner.nextInt();

		      
		        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
		       
		        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

		       
		        System.out.println("The youngest friend is with age: " + youngestAge);
		        System.out.println("The tallest friend is with height: " + tallestHeight + " cm");

		        scanner.close();
		   
	}

}
