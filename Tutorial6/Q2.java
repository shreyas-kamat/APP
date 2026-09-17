// Q2: Payment interface implemented by CreditCard, UPI and Net Banking payments

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolder;

    CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    private String maskedCard() {
        return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Holder : " + cardHolder);
        System.out.println("Card Number : " + maskedCard());
        System.out.println("Amount Paid : Rs. " + amount + " (2% processing fee: Rs. "
                + (amount * 0.02) + ")");
        System.out.println("Payment successful via Credit Card.");
    }
}

class UPIPayment implements Payment {
    private String upiId;

    UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID      : " + upiId);
        System.out.println("Amount Paid : Rs. " + amount + " (no extra charges)");
        System.out.println("Payment successful via UPI.");
    }
}

class NetBankingPayment implements Payment {
    private String bankName;
    private String accountNumber;

    NetBankingPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Net Banking payment...");
        System.out.println("Bank        : " + bankName);
        System.out.println("Account     : " + accountNumber);
        System.out.println("Amount Paid : Rs. " + amount + " (redirected to bank gateway)");
        System.out.println("Payment successful via Net Banking.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        // One interface reference, many implementations
        Payment payment;

        payment = new CreditCardPayment("4321567898761234", "Shreyas Kamat");
        payment.pay(2500.0);
        System.out.println();

        payment = new UPIPayment("shreyas@okaxis");
        payment.pay(750.50);
        System.out.println();

        payment = new NetBankingPayment("State Bank of India", "3021XXXX8890");
        payment.pay(12000.0);
        System.out.println();

        // Same call, different behaviour decided at run time
        Payment[] modes = {
            new UPIPayment("customer@ybl"),
            new CreditCardPayment("5555444433332222", "Riya Sharma"),
            new NetBankingPayment("HDFC Bank", "5012XXXX3344")
        };

        System.out.println("=== Checkout of Rs. 999.99 through every mode ===");
        for (Payment mode : modes) {
            mode.pay(999.99);
            System.out.println();
        }
    }
}
