package atmproject.Accounts;

// CheckingAccount class extending Account
public class CheckingAccount extends Account {
    private static final double TRANSACTION_FEE = 0.2;

    public CheckingAccount(double initialBalance, String pin) {
        super(initialBalance, pin);
    }

    // Override transaction fee for checking account
    @Override
    public double getTransactionFee() {
        return TRANSACTION_FEE;
    }
}