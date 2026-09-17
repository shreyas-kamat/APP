import java.util.*;

class Employee {
    protected String name;
    protected int employeeId;
    protected double basicSalary;

    Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    String getDesignation() {
        return "Employee";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + getDesignation());
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("");
    }
}

class Professor extends Employee {
    private int researchPapers;

    Professor(String name, int employeeId, double basicSalary, int researchPapers) {
        super(name, employeeId, basicSalary);
        this.researchPapers = researchPapers;
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.40) + (researchPapers * 5000);
    }

    String getDesignation() {
        return "Professor";
    }
}

class LabAssistant extends Employee {
    private int overtimeHours;

    LabAssistant(String name, int employeeId, double basicSalary, int overtimeHours) {
        super(name, employeeId, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    double calculateSalary() {
        // 20% allowance on basic + 300 per overtime hour
        return basicSalary + (basicSalary * 0.20) + (overtimeHours * 300);
    }

    String getDesignation() {
        return "Lab Assistant";
    }
}

class AdministrativeStaff extends Employee {
    private int yearsOfService;

    AdministrativeStaff(String name, int employeeId, double basicSalary, int yearsOfService) {
        super(name, employeeId, basicSalary);
        this.yearsOfService = yearsOfService;
    }

    double calculateSalary() {
        // 25% allowance on basic + 1000 per year of service
        return basicSalary + (basicSalary * 0.25) + (yearsOfService * 1000);
    }

    String getDesignation() {
        return "Administrative Staff";
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Employees: ");
        int count = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("1. Professor");
            System.out.println("2. Lab Assistant");
            System.out.println("3. Administrative Staff");
            System.out.print("Enter Type: ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Employee ID: ");
            int employeeId = sc.nextInt();
            System.out.print("Basic Salary: ");
            double basicSalary = sc.nextDouble();

            if (type == 1) {
                System.out.print("Research Papers Published: ");
                employees[i] = new Professor(name, employeeId, basicSalary, sc.nextInt());
            } else if (type == 2) {
                System.out.print("Overtime Hours: ");
                employees[i] = new LabAssistant(name, employeeId, basicSalary, sc.nextInt());
            } else if (type == 3) {
                System.out.print("Years of Service: ");
                employees[i] = new AdministrativeStaff(name, employeeId, basicSalary, sc.nextInt());
            } else {
                System.out.println("Invalid type, treated as a general employee.");
                employees[i] = new Employee(name, employeeId, basicSalary);
            }
            System.out.println("");
        }

        System.out.println("SALARY DETAILS");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
