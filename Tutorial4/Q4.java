import java.util.*;

class Patient {
    String patientName;
    double consultationFee;

    double discount;
    double finalAmount;

    Patient(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    void calculateFinalAmount(double fee) {
        if (fee >= 2000) {
            discount = fee * 0.10;
        } else {
            discount = fee * 0.05;
        }

        finalAmount = fee - discount;
    }

    void display() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Consultation Fee: Rs." + consultationFee);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);
        System.out.println("");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[5];

        for (int i = 0; i < patients.length; i++) {
            System.out.println("Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();
            System.out.println("");

            patients[i] = new Patient(name, fee);
            patients[i].calculateFinalAmount(fee);
        }

        System.out.println("---------- BILLING DETAILS ----------");
        for (int i = 0; i < patients.length; i++) {
            patients[i].display();
        }

        sc.close();
    }
}
