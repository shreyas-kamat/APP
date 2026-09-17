import java.util.*;

class Temperature {
    double celsius;
}

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Temperature t = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        t.celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5.0 * t.celsius) + 32;

        System.out.println("TEMPERATURE REPORT");
        System.out.printf("Celsius : %.2f C %n", t.celsius);
        System.out.printf("Fahrenheit : %.2f F %n", fahrenheit);

        scanner.close();
    }
}
