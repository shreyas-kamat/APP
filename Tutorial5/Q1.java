import java.util.*;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance = balance - amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("ACCOUNT DETAILS");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Opening Balance: ");
        double openingBalance = sc.nextDouble();
        System.out.println("");

        BankAccount account = new BankAccount(accountNumber, accountHolderName, openingBalance);
        account.display();

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Amount to Deposit: ");
                account.deposit(sc.nextDouble());
                account.display();
            } else if (choice == 2) {
                System.out.print("Amount to Withdraw: ");
                account.withdraw(sc.nextDouble());
                account.display();
            } else if (choice == 3) {
                account.display();
            } else if (choice == 4) {
                System.out.println("Thank you for banking with us.");
            } else {
                System.out.println("Invalid choice.");
                System.out.println("");
            }
        }

        sc.close();
    }
}
