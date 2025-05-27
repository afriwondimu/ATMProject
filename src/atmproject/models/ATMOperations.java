package atmproject.models;

import atmproject.Accounts.Account;

// Interface for ATM operations
public interface ATMOperations {
    void withdraw(Account account, double amount) throws Exception;
    void deposit(Account account, double amount) throws Exception;
    double checkBalance(Account account);
}