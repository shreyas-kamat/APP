import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = new int[5];
        int total = 0;

        System.out.println("Enter prices of 5 products :");

        for (int i = 0; i < prices.length; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("No input received. Run this in a normal terminal window.");
                sc.close();
                return;
            }
            prices[i] = sc.nextInt();
            total = total + prices[i];
        }

        System.out.println("Total Bill : " + total);

        if (total > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}
