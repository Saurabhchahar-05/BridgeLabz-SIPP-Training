package day5_workshop;
import java.util.Scanner;
class IceCream {
    String flavour;
    int sales;
    public IceCream(String flavour, int sales) {
        this.flavour = flavour;
        this.sales = sales;
    }
}

public class IceCreamRush {
    static void bubbleSort(IceCream[] flavours) {
        int n = flavours.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (flavours[j].sales < flavours[j + 1].sales) {
                    
                    IceCream temp = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IceCream[] flavours = new IceCream[8];
        System.out.println("Enter 8 ice cream flavours and their weekly sales:");
        for (int i = 0; i < flavours.length; i++) {
            System.out.print("Flavour " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Sales for " + name + ": ");
            int sales = Integer.parseInt(sc.nextLine());
            flavours[i] = new IceCream(name, sales);
        }
        bubbleSort(flavours);
        System.out.println("Flavours Sorted by Popularity(highest sales first):");
        for (IceCream iceCream : flavours) {
            System.out.println(iceCream.flavour + " - " + iceCream.sales + " sales");
        }
        sc.close();
    }
}


	      
