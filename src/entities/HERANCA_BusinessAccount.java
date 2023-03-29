package entities;

public class HERANCA_BusinessAccount extends HERANCA_Account {
    private Double loanLimit;

    public HERANCA_BusinessAccount() {
    }

    public HERANCA_BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance = amount - 10;
        }
    }

    // Another Override example
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
