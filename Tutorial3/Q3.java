import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println();
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees : ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("Employee ID   : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name : ");
            String name = sc.nextLine();

            System.out.print("Salary        : ");
            double sal = sc.nextDouble();

            emp[i] = new Employee(id, name, sal);
        }

        System.out.println("\n--- Employee Details ---\n");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
