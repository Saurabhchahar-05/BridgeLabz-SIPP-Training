package Day3_array;
import java.util.Scanner;

public class BonusCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        double[] salary = new double[10]; 
		        double[] years = new double[10];  

		        double totalBonus = 0;
		        double totalOldSalary = 0;
		        double totalNewSalary = 0;

		       
		        for (int i = 0; i < 10; i++) {
		            System.out.println("Enter salary for employee " + (i + 1));
		            salary[i] = scanner.nextDouble();

		            System.out.println("Enter years of service for employee " + (i + 1));
		            years[i] = scanner.nextDouble();

		           
		            double bonusPercent = years[i] > 5 ? 0.05 : 0.02;
		            double bonus = salary[i] * bonusPercent;

		           
		            double newSalary = salary[i] + bonus;

		           
		            totalBonus += bonus;
		            totalOldSalary += salary[i];
		            totalNewSalary += newSalary;
		        }

		       
		        System.out.println("Total bonus to pay: $" + totalBonus);
		        System.out.println("Total of previous salaries: $" + totalOldSalary);
		        System.out.println("Total of new salaries: $" + totalNewSalary);
		   

	}

}
