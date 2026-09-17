import java.util.*;

class Student {
    String name;
    String rollNumber;

    void display() {
        System.out.println("STUDENT DETAILS");
        System.out.printf("Name : %s %n", name);
        System.out.printf("Roll Number : %s %n", rollNumber);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNumber = scanner.nextLine();

        s.display();

        scanner.close();
    }
}
