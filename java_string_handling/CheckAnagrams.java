package java_string_handling;
import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		     
		        System.out.println("Enter the first string:");
		        String str1 = scanner.nextLine();

		       
		        System.out.println("Enter the second string:");
		        String str2 = scanner.nextLine();

		       
		        if (areAnagrams(str1, str2)) {
		            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
		        } else {
		            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
		        }

		        scanner.close();
		    }

		    public static boolean areAnagrams(String s1, String s2) {
		       
		        s1 = s1.replaceAll("\\s+", "").toLowerCase();
		        s2 = s2.replaceAll("\\s+", "").toLowerCase();

		       
		        char[] arr1 = s1.toCharArray();
		        char[] arr2 = s2.toCharArray();

		        Arrays.sort(arr1);
		        Arrays.sort(arr2);

		        
		        return Arrays.equals(arr1, arr2);
		  

	}

}
