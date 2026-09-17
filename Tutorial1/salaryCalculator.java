import java.util.*;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = scanner.nextDouble();

        System.out.print("Enter allowance: ");
        double allowance = scanner.nextDouble();

        double total = basic + allowance;

        System.out.println("EMPLOYEE SALARY SLIP");
        System.out.printf("%-20s : %.2f%n", "Basic salary", basic);
        System.out.printf("%-20s : %.2f%n", "Allowance", allowance);
        System.out.printf("%-20s : %.2f%n", "Total salary", total);

        scanner.close();
    }
}


