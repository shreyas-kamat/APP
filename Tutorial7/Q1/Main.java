import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Aarav Sharma", "Computer Engineering", 2),
            new Student(102, "Priya Nair", "Information Technology", 3)
        };

        Course[] courses = {
            new Course("CS201", "Advanced Java Programming", 4, "Prof. Mehta"),
            new Course("CS202", "Database Management Systems", 3, "Prof. Kulkarni")
        };

        System.out.println("========== STUDENT DETAILS ==========");
        for (Student s : students) {
            s.display();
            System.out.println("-------------------------------------");
        }

        System.out.println("\n========== COURSE DETAILS ==========");
        for (Course c : courses) {
            c.display();
            System.out.println("-------------------------------------");
        }
    }
}
