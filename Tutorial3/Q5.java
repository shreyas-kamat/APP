public class Q5 {

    public double area(double side) {
        return side * side;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double area(float radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Q5 ac = new Q5();

        System.out.println("Area of Square    : " + ac.area(5.0));
        System.out.println("Area of Rectangle : " + ac.area(10.0, 4.0));
        System.out.println("Area of Circle    : " + ac.area(7.0f));
    }
}
