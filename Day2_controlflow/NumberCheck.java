package Day2_controlflow;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        Scanner scanner = new Scanner(System.in);

		      
		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		      
		        if (number > 0) {
		            System.out.println("Positive");
		        } else if (number < 0) {
		            System.out.println("Negative");
		        } else {
		            System.out.println("Zero");
		        }

		        scanner.close();
		  
	}

}
