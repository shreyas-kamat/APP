import java.util.*;

public class studentInfo {
    public static void main(String[] args) {
        // int year = 2000;
        // System.out.println(year);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        String regNumber = scanner.nextLine();
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
        System.out.print("Enter year of study: ");
        String year = scanner.nextLine();
        System.out.print("Enter college name: ");
        String collegeName = scanner.nextLine();

        System.out.println("STUDENT INFORMATION SYSTEM");
        System.out.printf("Name : %s%n", name);
        System.out.printf("RegNo : %s%n", regNumber);
        System.out.printf("Department : %s%n", department);
        System.out.printf("Year of Study : %s%n", year);
        System.out.printf("College : %s%n", collegeName);
    }
}


