package atmproject.models;

import java.util.Scanner;

import atmproject.Accounts.Account;

// ATM class implementing ATMOperations interface
public class ATM implements ATMOperations {
    private final Scanner scanner;

    public ATM() {
        this.scanner = new Scanner(System.in);
    }

    // Withdraw money from account
    @Override
    public void withdraw(Account account, double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount. Please enter a positive value.");
        }
        double fee = account.getTransactionFee();
        double totalDeduction = amount + fee;
        if (totalDeduction > account.getBalance()) {
            throw new Exception("Insufficient funds. Including fee (" + fee + " ETB), you need $" + totalDeduction);
        }
        account.setBalance(account.getBalance() - totalDeduction);
        System.out.println("Withdrawal successful. Amount: " + amount + " ETB, Fee: " + fee + " ETB");
        System.out.println("New balance: $" + account.getBalance());
    }

    // Deposit money to account
    @Override
    public void deposit(Account account, double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount. Please enter a positive value.");
        }
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. Amount: " + amount + " ETB");
        System.out.println("New balance: " + account.getBalance() + " ETB");
    }

    // Check account balance
    @Override
    public double checkBalance(Account account) {
        return account.getBalance();
    }

    // Verify PIN with user input
    public boolean authenticate(Account account) {
        System.out.print("Enter PIN: ");
        String inputPin = scanner.nextLine();
        return account.verifyPin(inputPin);
    }

    // Display ATM menu
    public void displayMenu() {
        System.out.println("\n=== ATM Menu ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }
}