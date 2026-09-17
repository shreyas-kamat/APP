import java.util.*;

interface Payment {
    void makePayment(double amount);
}

class UPIPayment implements Payment {
    private String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void makePayment(double amount) {
        System.out.println("---------- UPI PAYMENT ----------");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment of " + amount + " completed using UPI.");
        System.out.println("");
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;

    CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    private String maskedCard() {
        if (cardNumber.length() <= 4) {
            return cardNumber;
        }
        return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
    }

    public void makePayment(double amount) {
        double processingFee = amount * 0.02;
        System.out.println("---------- CREDIT CARD PAYMENT ----------");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + maskedCard());
        System.out.println("Amount: " + amount);
        System.out.println("Processing Fee (2%): " + processingFee);
        System.out.println("Payment of " + (amount + processingFee) + " completed using Credit Card.");
        System.out.println("");
    }
}

class NetBankingPayment implements Payment {
    private String bankName;
    private String accountNumber;

    NetBankingPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void makePayment(double amount) {
        System.out.println("---------- NET BANKING PAYMENT ----------");
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Payment of " + amount + " completed using Net Banking.");
        System.out.println("");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Order Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("");

        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("");

        Payment payment = null;

        if (choice == 1) {
            System.out.print("UPI ID: ");
            payment = new UPIPayment(sc.nextLine());
        } else if (choice == 2) {
            System.out.print("Card Number: ");
            String cardNumber = sc.nextLine();
            System.out.print("Card Holder Name: ");
            payment = new CreditCardPayment(cardNumber, sc.nextLine());
        } else if (choice == 3) {
            System.out.print("Bank Name: ");
            String bankName = sc.nextLine();
            System.out.print("Account Number: ");
            payment = new NetBankingPayment(bankName, sc.nextLine());
        } else {
            System.out.println("Invalid payment method selected.");
        }

        System.out.println("");

        if (payment != null) {
            payment.makePayment(amount);
        }

        sc.close();
    }
}
