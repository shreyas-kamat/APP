import java.util.*;

class Rectangle {
    double length;
    double breadth;

    void area() {
        double area = length * breadth;
        System.out.println("ROOM FLOOR AREA");
        System.out.printf("Length : %.2f %n", length);
        System.out.printf("Breadth : %.2f %n", breadth);
        System.out.printf("Area : %.2f %n", area);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter length of room: ");
        r.length = scanner.nextDouble();

        System.out.print("Enter breadth of room: ");
        r.breadth = scanner.nextDouble();

        r.area();

        scanner.close();
    }
}
