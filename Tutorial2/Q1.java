import java.util.*;

class Student {
    String name;
    String rollNumber;
    String department;
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNumber = scanner.nextLine();

        System.out.print("Enter department: ");
        s.department = scanner.nextLine();

        System.out.println("STUDENT DETAILS");
        System.out.printf("Name : %s %n", s.name);
        System.out.printf("Roll Number : %s %n", s.rollNumber);
        System.out.printf("Department : %s %n", s.department);

        scanner.close();
    }
}
