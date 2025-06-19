package Day3_array;
import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		       
		        int num = scanner.nextInt();

		       
		        int maxFactor = 10; 
		        int[] factors = new int[maxFactor];
		        int index = 0; 

		        
		        for (int i = 1; i <= num; i++) {
		            if (num % i == 0) {
		              
		                if (index == maxFactor) {
		                   
		                    maxFactor = maxFactor * 2;
		                    int[] temp = new int[maxFactor];
		                    System.arraycopy(factors, 0, temp, 0, factors.length);
		                    factors = temp;
		                }
		               
		                factors[index] = i;
		                index++;
		            }
		        }

		       
		        System.out.print("Factors of " + num + " are: ");
		        for (int i = 0; i < index; i++) {
		            System.out.print(factors[i] + " ");
		        }
		        System.out.println();
		        
		        scanner.close();
		   

	}

}
