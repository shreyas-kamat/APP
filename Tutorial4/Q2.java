import java.util.*;

class Student {
    int rollNumber;
    String studentName;
    int[] marks = new int[3];
    double attendance;

    int totalMarks;
    double averageMarks;
    String result;
    String scholarship;
    String performance;

    void evaluate() {
        totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        averageMarks = (double) totalMarks / marks.length;

        result = (averageMarks >= 50) ? "Pass" : "Fail";
        scholarship = (averageMarks >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";
        performance = (averageMarks >= 85) ? "Excellent" : "Good";
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            students[i].rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            students[i].studentName = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Marks in Subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }

            System.out.print("Attendance Percentage: ");
            students[i].attendance = sc.nextDouble();
            System.out.println("");

            students[i].evaluate();
        }

        System.out.println("---------- STUDENT DETAILS ----------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Roll Number: " + students[i].rollNumber);
            System.out.println("Name: " + students[i].studentName);
            System.out.println("Total Marks: " + students[i].totalMarks);
            System.out.println("Average Marks: " + students[i].averageMarks);
            System.out.println("Attendance: " + students[i].attendance + "%");
            System.out.println("Result: " + students[i].result);
            System.out.println("Scholarship: " + students[i].scholarship);
            System.out.println("Performance: " + students[i].performance);
            System.out.println("");
        }

        Student topper = students[0];
        for (int i = 1; i < students.length; i++) {
            topper = (students[i].averageMarks > topper.averageMarks) ? students[i] : topper;
        }

        System.out.println("---------- HIGHEST AVERAGE ----------");
        System.out.println("Roll Number: " + topper.rollNumber);
        System.out.println("Name: " + topper.studentName);
        System.out.println("Average Marks: " + topper.averageMarks);

        sc.close();
    }
}
