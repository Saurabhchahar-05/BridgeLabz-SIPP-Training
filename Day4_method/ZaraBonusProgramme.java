package Day4_method;
import java.util.Random;
public class ZaraBonusProgramme {
	 public static Object[][] generateEmployeeData() {
	        Random rand = new Random();
	        Object[][] employeeData = new Object[10][2]; 

	        for (int i = 0; i < 10; i++) {
	            double salary = 10000 + rand.nextInt(90000); 
	            int yearsOfService = 1 + rand.nextInt(20); 
	            employeeData[i][0] = salary;
	            employeeData[i][1] = yearsOfService;
	        }
	        return employeeData;
	    }

	   
	    public static Object[][] calculateBonuses(Object[][] employeeData) {
	        Object[][] updatedData = new Object[employeeData.length][3]; 
	        for (int i = 0; i < employeeData.length; i++) {
	            double oldSalary = (double) employeeData[i][0];
	            int years = (int) employeeData[i][1];
	            double bonusPercent = (years > 5) ? 0.05 : 0.02;
	            double bonusAmount = oldSalary * bonusPercent;
	            double newSalary = oldSalary + bonusAmount;
	            updatedData[i][0] = oldSalary;
	            updatedData[i][1] = bonusAmount;
	            updatedData[i][2] = newSalary;
	        }
	        return updatedData;
	    }

	   
	    public static void displayResults(Object[][] oldData, Object[][] newData) {
	        double totalOldSalary = 0;
	        double totalBonus = 0;
	        double totalNewSalary = 0;

	        System.out.println("-------------------------------------------------------------");
	        System.out.printf("%-10s %-15s %-15s %-15s%n", "Emp#", "Old Salary", "Bonus", "New Salary");
	        System.out.println("-------------------------------------------------------------");
	        for (int i = 0; i < oldData.length; i++) {
	            double oldSal = (double) oldData[i][0];
	            double bonus = (double) newData[i][1];
	            double newSal = (double) newData[i][2];

	            totalOldSalary += oldSal;
	            totalBonus += bonus;
	            totalNewSalary += newSal;

	            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n", i + 1, oldSal, bonus, newSal);
	        }
	        System.out.println("-------------------------------------------------------------");
	        System.out.printf("%-10s %-15.2f %-15.2f %-15.2f%n", "TOTAL", totalOldSalary, totalBonus, totalNewSalary);
	        System.out.println("-------------------------------------------------------------");
	        double totalBonusPaid = totalBonus;
	        double totalPayment = totalOldSalary + totalBonusPaid;
	        System.out.println("Total Bonus Amount Zara has to pay: " + totalBonusPaid);
	        System.out.println("Total salary and bonus payout: " + totalPayment);
	    }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] employeeData = generateEmployeeData();

        // Display generated old salaries and years of service
        System.out.println("Employee Data (Old Salary and Years of Service):");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.println("Employee " + (i + 1) + ": Salary = " + employeeData[i][0] + ", Years of Service = " + employeeData[i][1]);
        }
        System.out.println();

        // Calculate bonuses and new salaries
        Object[][] updatedData = calculateBonuses(employeeData);

        // Display the result in table format
        displayResults(employeeData, updatedData);

	}

}
