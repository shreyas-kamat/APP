import java.util.*;

public class highestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of student 1: ");
        String name1 = scanner.next();
        System.out.print("Enter score of student 1: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter name of student 2: ");
        String name2 = scanner.next();
        System.out.print("Enter score of student 2: ");
        int score2 = scanner.nextInt();

        System.out.print("Enter name of student 3: ");
        String name3 = scanner.next();
        System.out.print("Enter score of student 3: ");
        int score3 = scanner.nextInt();

        String topName = name1;
        int topScore = score1;

        if (score2 > topScore) {
            topName = name2;
            topScore = score2;
        }
        if (score3 > topScore) {
            topName = name3;
            topScore = score3;
        }

        System.out.println("CODING COMPETITION RESULT");
        System.out.printf("%-10s : %d%n", name1, score1);
        System.out.printf("%-10s : %d%n", name2, score2);
        System.out.printf("%-10s : %d%n", name3, score3);
        System.out.printf("Highest score : %s with %d marks%n", topName, topScore);

        scanner.close();
    }
}


