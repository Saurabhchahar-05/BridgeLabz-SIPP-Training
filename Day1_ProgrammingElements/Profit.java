package Day1_ProgrammingElements;

public class Profit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int costPrice = 129;
		        int sellingPrice = 191;

		       
		        int profit = sellingPrice - costPrice;

		        
		        double profitPercentage = (profit / (double) costPrice) * 100;

		       
		        System.out.println("The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice +
		                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
		  

	}

}
