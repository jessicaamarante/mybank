package entities;

public class Account {
    private Long accountNumber;
    private String name;
    private double balance;

    public Account(Long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }
    public Account(Long accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit (double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Titular name: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
