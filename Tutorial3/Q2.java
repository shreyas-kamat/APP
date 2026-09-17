import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int present = 0;

        System.out.println("Enter attendance for 7 days (1 = Present, 0 = Absent) :");

        for (int i = 0; i < attendance.length; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("No input received. Run this in a normal terminal window.");
                sc.close();
                return;
            }
            attendance[i] = sc.nextInt();
            if (attendance[i] == 1) {
                present = present + 1;
            }
        }

        double percentage = (present * 100.0) / attendance.length;

        System.out.println("Present Days : " + present);
        System.out.println("Attendance Percentage : " + percentage);

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
