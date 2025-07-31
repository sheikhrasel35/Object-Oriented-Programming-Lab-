// File: BankAccountExample.java

// Class that uses encapsulation
class BankAccount {
    // Private fields: cannot be accessed directly from outside
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize values
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account holder name
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // No setter for account number to prevent external changes

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Main class
public class BankAccountExample {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("sheikh rasel", "ACC123456", 5000.0);

        // Access and update data using encapsulated methods
        account.displayAccountInfo();

        account.deposit(1000.0);
        account.withdraw(300.0);
        account.setAccountHolder("sheikh rasel"); // Updating name

        account.displayAccountInfo();

        // Attempt invalid transaction
        account.withdraw(10000.0);
    }
}
