package Day5_string;

public class NullPointerExceptionDemo {
	 public static void generateNullPointerException() {
	        String text = null;
	        
	        System.out.println("Length of text: " + text.length());
	    }

	   
	    public static void handleNullPointerException() {
	        String text = null;
	        try {
	           
	            System.out.println("Length of text: " + text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException: " + e.getMessage());
	            
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            generateNullPointerException();
	        } catch (NullPointerException e) {
	            System.out.println("Exception caught in main: " + e);
	        }

	        System.out.println("\nRefactored to handle exception:");
	       
	        handleNullPointerException();
		

	}

}
