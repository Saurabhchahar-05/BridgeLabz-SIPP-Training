package Day4_method;
import java.util.Scanner;
public class GeometryCalculator {
	public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineParams = new double[2];
        if (x1 == x2) {
           
            
            lineParams[0] = Double.POSITIVE_INFINITY; 
            lineParams[1] = Double.NaN; 
        } else {
            // Calculate slope m
            double m = (y2 - y1) / (x2 - x1);
           
            double b = y1 - m * x1;
            lineParams[0] = m;
            lineParams[1] = b;
        }
        return lineParams;
    }


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

       
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between points: " + distance);

       
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        if (Double.isInfinite(slope)) {
            System.out.println("The line is vertical, x = " + x1);
        } else {
            System.out.println("Line equation: y = " + slope + "x + " + yIntercept);
        }

        scanner.close();

	}

}
