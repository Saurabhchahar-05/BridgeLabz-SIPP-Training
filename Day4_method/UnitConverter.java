package Day4_method;

public class UnitConverter {


	   
	    public static double convertFahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }

	  
	    public static double convertCelsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	   
	    public static double poundsToKilograms(double pounds) {
	        return pounds * 0.453592;
	    }

	    
	    public static double kilogramsToPounds(double kilograms) {
	        return kilograms * 2.20462;
	    }

	    
	    public static double gallonsToLiters(double gallons) {
	        return gallons * 3.78541;
	    }

	   
	    public static double litersToGallons(double liters) {
	        return liters * 0.264172;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   
	}

}
