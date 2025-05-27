package atmproject.Accounts;

// Abstract class to represent a bank account with encapsulated data
public abstract class Account {
    private double balance;
    private final String pin;

    // Constructor
    public Account(double initialBalance, String pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Verify PIN
    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // Abstract method for transaction fee (to be overridden by child classes)
    public abstract double getTransactionFee();
}