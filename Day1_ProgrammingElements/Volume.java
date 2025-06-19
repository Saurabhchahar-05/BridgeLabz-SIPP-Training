package Day1_ProgrammingElements;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        double radiusKm = 6378;
		      
		        double kmToMiles = 0.621371;

		        
		        double pi = Math.PI;

		        
		        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

		        
		        double radiusMiles = radiusKm * kmToMiles;

		        
		        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

		        
		        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3);
		        System.out.println("The volume of earth in cubic miles is " + volumeMiles3);
		    
		

	}

}
