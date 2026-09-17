import java.util.*;

class Ride {
    int rideNumber;
    String rideName;

    Ride(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    void displayPattern() {
        System.out.print(rideName + " : ");
        for (int j = 1; j <= rideNumber; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ride[] rides = new Ride[5];

        for (int i = 0; i < rides.length; i++) {
            System.out.print("Name of Ride " + (i + 1) + ": ");
            String name = sc.nextLine();
            rides[i] = new Ride(i + 1, name);
        }
        System.out.println("");

        System.out.println("---------- RIDE ACTIVITY LEVELS ----------");
        for (int i = 0; i < rides.length; i++) {
            rides[i].displayPattern();
        }

        sc.close();
    }
}
