import java.util.*;

class Employee {
    String name;
    double salary;
}

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.print("Enter name of employee 1: ");
        e1.name = scanner.nextLine();
        System.out.print("Enter salary of employee 1: ");
        e1.salary = scanner.nextDouble();
        scanner.nextLine();

        Employee e2 = new Employee();
        System.out.print("Enter name of employee 2: ");
        e2.name = scanner.nextLine();
        System.out.print("Enter salary of employee 2: ");
        e2.salary = scanner.nextDouble();

        System.out.println("EMPLOYEE 1");
        System.out.printf("Name : %s %n", e1.name);
        System.out.printf("Salary : %.2f %n", e1.salary);

        System.out.println("EMPLOYEE 2");
        System.out.printf("Name : %s %n", e2.name);
        System.out.printf("Salary : %.2f %n", e2.salary);

        scanner.close();
    }
}
