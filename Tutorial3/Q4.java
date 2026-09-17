class Car {
    String model;
    double price;

    public Car() {
        this.model = "Not Specified";
        this.price = 0;
    }

    public Car(String model) {
        this.model = model;
        this.price = 0;
    }

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Swift");
        Car c3 = new Car("Creta", 1850000);

        System.out.println("Registered Without Details");
        c1.display();

        System.out.println("Registered With Model Only");
        c2.display();

        System.out.println("Registered With Model And Price");
        c3.display();
    }
}
