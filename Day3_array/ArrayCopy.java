package Day3_array;
import java.util.Scanner;
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();

		        System.out.print("Enter number of columns: ");
		        int columns = scanner.nextInt();

		        int[][] matrix = new int[rows][columns];

		       
		        System.out.println("Enter elements of the matrix:");
		        for (int i = 0; i < rows; i++) {
		            System.out.println("Row " + (i + 1) + ":");
		            for (int j = 0; j < columns; j++) {
		                System.out.print("Element [" + i + "][" + j + "]: ");
		                matrix[i][j] = scanner.nextInt();
		            }
		        }

		       
		        int[] array = new int[rows * columns];

		       
		        int index = 0;
		        for (int i = 0; i < rows; i++) {              
		            for (int j = 0; j < columns; j++) {         
		                array[index] = matrix[i][j];
		                index++;
		            }
		        }

		      
		        System.out.println("Elements in the 1D array:");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        scanner.close();
		   

	}

}
