public class Account {
    private double balance;
    private String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public boolean deposit (double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }
    public boolean withdraw(double amount){
        if (amount > balance) {
            System.out.println("Saldo tidak cukup");
            return false;
        }
        if (amount > 0){
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}