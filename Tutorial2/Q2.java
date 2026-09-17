import java.util.*;

class Book {
    String title;
    String author;
    double price;
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter book title: ");
        b.title = scanner.nextLine();

        System.out.print("Enter author name: ");
        b.author = scanner.nextLine();

        System.out.print("Enter price: ");
        b.price = scanner.nextDouble();

        System.out.println("BOOK DETAILS");
        System.out.printf("Title : %s %n", b.title);
        System.out.printf("Author : %s %n", b.author);
        System.out.printf("Price : %.2f %n", b.price);

        scanner.close();
    }
}
