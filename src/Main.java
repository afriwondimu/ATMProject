import java.util.Scanner;

import atmproject.Accounts.Account;
import atmproject.Accounts.CheckingAccount;
import atmproject.Accounts.SavingsAccount;
import atmproject.models.ATM;

// Main class to run the ATM program
public class Main {
    public static void main(String[] args) {
        // Display group members
        System.out.println("=== ATM Interface Project ===");
        System.out.println("Group Members:");
        System.out.println("1. Afri Wondimu - ID: 373677");
        System.out.println("2. Abrham Solomon - ID: 248574-16");
        System.out.println("3. Abrham Fekede - ID: 9767-16");
        System.out.println("4. Dagim Aboneh - ID: 364215-16");
        System.out.println("5. Mesay Mesfin - ID: 655392-16");
        System.out.println("6. Yabsira Zenebe - ID: 469869-16");
        System.out.println("===========================\n");

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        // Create accounts
        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        System.out.print("Enter choice (1 or 2): ");
        int accountChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Account account;
        if (accountChoice == 1) {
            account = new SavingsAccount(1000.0, "1234");
            System.out.println("Savings Account selected. Initial balance: 1000.0 ETB");
        } else {
            account = new CheckingAccount(1000.0, "1234");
            System.out.println("Checking Account selected. Initial balance: 1000.0  ETB");
        }

        // Authenticate user
        try {
            if (!atm.authenticate(account)) {
                System.out.println("Invalid PIN. Exiting...");
                return;
            }

            // Main ATM loop
            while (true) {
                atm.displayMenu();
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                try {
                    switch (choice) {
                        case 1 -> System.out.println("Current balance: " + atm.checkBalance(account) +" ETB");
                        case 2 -> {
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            atm.withdraw(account, withdrawAmount);
                        }
                        case 3 -> {
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            atm.deposit(account, depositAmount);
                        }
                        case 4 -> {
                            System.out.println("Thank you for using Bank Of Absinaya. Goodbye!");
                            return;
                        }
                        default -> System.out.println("Invalid option. Please try again.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}