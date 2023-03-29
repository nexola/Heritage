package entities;

// final class proíbe que a classe seja herdada por outra
public final class HERANCA_SavingsAccount extends HERANCA_Account{
    private Double interestRate;

    public HERANCA_SavingsAccount() {}

    public HERANCA_SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Sobrepõe o método da  superclasse
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

}
