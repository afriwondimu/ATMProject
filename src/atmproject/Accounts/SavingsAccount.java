package atmproject.Accounts;

// SavingsAccount class extending Account
public class SavingsAccount extends Account {
    private static final double TRANSACTION_FEE = 0.5;

    public SavingsAccount(double initialBalance, String pin) {
        super(initialBalance, pin);
    }

    // Override transaction fee for savings account
    @Override
    public double getTransactionFee() {
        return TRANSACTION_FEE;
    }
}