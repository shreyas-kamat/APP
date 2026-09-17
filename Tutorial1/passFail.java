import java.util.*;

public class passFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        System.out.println("INTERNAL ASSESSMENT RESULT");
        System.out.printf("%-10s : %d%n", "Marks", marks);

        if (marks >= 50) {
            System.out.println("Result     : Pass");
        } else {
            System.out.println("Result     : Fail");
        }

        scanner.close();
    }
}


