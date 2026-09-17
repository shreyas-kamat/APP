import java.util.*;

class Employee {
    int employeeId;
    String employeeName;
    double monthlySalary;

    double annualSalary;
    double bonus;
    String eligibility;

    void calculateAnnualSalary() {
        annualSalary = monthlySalary * 12;
    }

    void calculateBonus() {
        if (monthlySalary >= 30000) {
            bonus = annualSalary * 0.10;
            eligibility = "Eligible";
        } else {
            bonus = 0;
            eligibility = "Not Eligible";
        }
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Monthly Salary: Rs." + monthlySalary);
        System.out.println("Annual Salary: Rs." + annualSalary);
        System.out.println("Bonus: Rs." + bonus);
        System.out.println("Bonus Status: " + eligibility);
        System.out.println("");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();

            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            employees[i].employeeId = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            employees[i].employeeName = sc.nextLine();
            System.out.print("Monthly Salary: ");
            employees[i].monthlySalary = sc.nextDouble();
            System.out.println("");

            employees[i].calculateAnnualSalary();
            employees[i].calculateBonus();
        }

        System.out.println("---------- EMPLOYEE DETAILS ----------");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
