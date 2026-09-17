import java.util.*;

class Student {
    String name;
    int age;
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("Enter name of student 1: ");
        s1.name = scanner.nextLine();
        System.out.print("Enter age of student 1: ");
        s1.age = scanner.nextInt();
        scanner.nextLine();

        Student s2 = new Student();
        System.out.print("Enter name of student 2: ");
        s2.name = scanner.nextLine();
        System.out.print("Enter age of student 2: ");
        s2.age = scanner.nextInt();

        System.out.printf("Student 1 %n");
        System.out.printf("Name : %s %n", s1.name);
        System.out.printf("Age : %d %n", s1.age);

        System.out.printf("Student 2 %n");
        System.out.printf("Name : %s %n", s2.name);
        System.out.printf("Age : %d %n", s2.age);

        scanner.close();
    }
}
