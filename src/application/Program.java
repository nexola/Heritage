package application;

import entities.HERANCA_Account;
import entities.HERANCA_BusinessAccount;
import entities.HERANCA_SavingsAccount;

public class Program {
    public static void main(String[] args) {
        HERANCA_Account acc = new HERANCA_Account(1001, "Alex", 0.0);
        HERANCA_BusinessAccount bacc = new HERANCA_BusinessAccount(1002, "Maria", 0.0, 500.0);

        // Upcasting
        HERANCA_Account acc1 = bacc;
        HERANCA_Account acc2 = new HERANCA_BusinessAccount(1003, "Bob", 0.0, 200.0);
        HERANCA_Account acc3 = new HERANCA_SavingsAccount(1004, "Ana", 0.0, 0.01);

        // Downcasting
        HERANCA_BusinessAccount acc4 = (HERANCA_BusinessAccount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof HERANCA_BusinessAccount) {
            HERANCA_BusinessAccount acc5 = (HERANCA_BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof HERANCA_SavingsAccount) {
            HERANCA_SavingsAccount acc5 = (HERANCA_SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        HERANCA_Account acc6 = new HERANCA_Account(1005, "Joe", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        HERANCA_Account acc7 = new HERANCA_SavingsAccount(1006, "Larry", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
    }
}
