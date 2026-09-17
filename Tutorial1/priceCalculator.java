import java.util.*;

public class priceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of product 1: ");
        double price1 = scanner.nextDouble();

        System.out.print("Enter price of product 2: ");
        double price2 = scanner.nextDouble();

        double total = price1 + price2;
        double difference = price1 - price2;
        double product = price1 * price2;

        System.out.println("SUPERMARKET BILL CALCULATOR");
        System.out.printf("%-20s : %.2f%n", "Price 1", price1);
        System.out.printf("%-20s : %.2f%n", "Price 2", price2);
        System.out.printf("%-20s : %.2f%n", "Total (sum)", total);
        System.out.printf("%-20s : %.2f%n", "Difference", difference);
        System.out.printf("%-20s : %.2f%n", "Product", product);

        if (price2 == 0) {
            System.out.println("Quotient and remainder undefined (price 2 is zero)");
        } else {
            double quotient = price1 / price2;
            double remainder = price1 % price2;
            System.out.printf("%-20s : %.2f%n", "Quotient", quotient);
            System.out.printf("%-20s : %.2f%n", "Remainder", remainder);
        }

        scanner.close();
    }
}

