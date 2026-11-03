package daspro_jobsheet8;

import java.util.Scanner;

public class KafeDoWhile23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coffee, tea, breads, totalPrice;
        int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;

        do{
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = input.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }

            System.out.print("Number of coffees: ");
            coffee = input.nextInt();
            System.out.print("Number of teas: ");
            tea = input.nextInt();
            System.out.print("Number of breads: ");
            breads = input.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (breads * breadPrice);
            System.out.println("Total to be paid: Rp" + totalPrice);
            input.nextLine();
        } while (true);
        System.out.println("All transactions completed.");

        input.close();
    }
}
