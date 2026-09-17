package student;

public class Student {
    private int rollNo;
    private String name;
    private String department;
    private int year;

    public Student(int rollNo, String name, String department, int year) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.year = year;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public void display() {
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Year       : " + year);
    }
}
