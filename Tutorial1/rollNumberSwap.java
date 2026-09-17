import java.util.*;

public class rollNumberSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number of student 1: ");
        int roll1 = scanner.nextInt();

        System.out.print("Enter roll number of student 2: ");
        int roll2 = scanner.nextInt();

        System.out.println("ROLL NUMBER SWAP");
        System.out.printf("Before swap : Roll1 = %d, Roll2 = %d%n", roll1, roll2);

        // (a) Using a temporary variable
        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;
        System.out.printf("(a) With temp variable    : Roll1 = %d, Roll2 = %d%n", roll1, roll2);

        // (b) Without using a temporary variable (swap back to original)
        roll1 = roll1 + roll2;
        roll2 = roll1 - roll2;
        roll1 = roll1 - roll2;
        System.out.printf("(b) Without temp variable : Roll1 = %d, Roll2 = %d%n", roll1, roll2);

        scanner.close();
    }
}
