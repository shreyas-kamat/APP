import java.util.*;

public class seatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int seat = scanner.nextInt();

        System.out.println("MOVIE THEATRE COUNTER");
        if (seat % 2 == 0) {
            System.out.printf("Seat %d is EVEN - go to the even counter%n", seat);
        } else {
            System.out.printf("Seat %d is ODD - go to the odd counter%n", seat);
        }

        scanner.close();
    }
}


