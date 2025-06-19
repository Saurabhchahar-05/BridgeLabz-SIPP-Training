package Day3_array;
import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        int[] numbers = new int[5];

		       
		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.print("Number " + (i + 1) + ": ");
		            numbers[i] = scanner.nextInt();
		        }

		       
		        for (int num : numbers) {
		            if (num > 0) {
		                
		                if (num % 2 == 0) {
		                    System.out.println(num + " is positive and even.");
		                } else {
		                    System.out.println(num + " is positive and odd.");
		                }
		            } else if (num < 0) {
		               
		                System.out.println(num + " is negative.");
		            } else {
		              
		                System.out.println("Number is zero.");
		            }
		        }

		       
		        int first = numbers[0];
		        int last = numbers[numbers.length - 1];

		        if (first == last) {
		            System.out.println("The first and last elements are equal.");
		        } else if (first > last) {
		            System.out.println("The first element is greater than the last element.");
		        } else {
		            System.out.println("The first element is less than the last element.");
		        }

		        scanner.close();
		   
		// TODO Auto-generated method stub

	}

}
