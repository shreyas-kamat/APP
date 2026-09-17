import java.util.*;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    double totalPrice;
    double discount;
    double finalPrice;

    void calculateBill() {
        totalPrice = price * quantity;

        if (totalPrice >= 5000) {
            discount = totalPrice * 0.10;
        } else {
            discount = totalPrice * 0.05;
        }

        finalPrice = totalPrice - discount;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();

            System.out.println("Product " + (i + 1) + ":");
            System.out.print("ID: ");
            products[i].productId = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            products[i].productName = sc.nextLine();
            System.out.print("Price: ");
            products[i].price = sc.nextDouble();
            System.out.print("Quantity: ");
            products[i].quantity = sc.nextInt();
            System.out.println("");

            products[i].calculateBill();
        }

        System.out.println("---------- BILL DETAILS ----------");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product ID: " + products[i].productId);
            System.out.println("Name: " + products[i].productName);
            System.out.println("Total Price: Rs." + products[i].totalPrice);
            System.out.println("Discount: Rs." + products[i].discount);
            System.out.println("Final Price: Rs." + products[i].finalPrice);
            System.out.println("");
        }

        sc.close();
    }
}
