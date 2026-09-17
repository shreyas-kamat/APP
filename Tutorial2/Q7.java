import java.util.*;

class Marks {
    double subject1;
    double subject2;
    double subject3;
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Marks m = new Marks();

        System.out.print("Enter marks of subject 1: ");
        m.subject1 = scanner.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        m.subject2 = scanner.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        m.subject3 = scanner.nextDouble();

        double total = m.subject1 + m.subject2 + m.subject3;
        double average = total / 3;

        System.out.println("MARKS DETAILS");
        System.out.printf("Subject 1 : %.2f %n", m.subject1);
        System.out.printf("Subject 2 : %.2f %n", m.subject2);
        System.out.printf("Subject 3 : %.2f %n", m.subject3);
        System.out.printf("Total Marks : %.2f %n", total);
        System.out.printf("Average Marks : %.2f %n", average);

        scanner.close();
    }
}
