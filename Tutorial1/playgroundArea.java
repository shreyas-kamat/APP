import java.util.*;

public class playgroundArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of playground (m): ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of playground (m): ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;

        System.out.println("PLAYGROUND AREA CALCULATOR");
        System.out.printf("%-20s : %.2f m%n", "Length", length);
        System.out.printf("%-20s : %.2f m%n", "Breadth", breadth);
        System.out.printf("%-20s : %.2f sq.m%n", "Area", area);

        scanner.close();
    }
}


