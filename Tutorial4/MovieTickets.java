import java.util.*;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Enter Day: ");
        String day = sc.nextLine();
        double ticket = 200.00;

        if (age <= 12) {
            ticket = 100;
            if (day == "Wednesday") {
                ticket = ticket * 0.8;
            }
        } else if (age >= 65) {
            ticket = 120;
            if (day == "Wednesday") {
                ticket = ticket * 0.8;
            }
        }
        else {
            if (day == "Wednesday") {
                ticket = ticket * 0.8;
            }
        }

        System.out.println("");
        System.out.println(ticket);
        sc.close();
    }
}
