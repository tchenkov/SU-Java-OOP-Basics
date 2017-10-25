package L01_DefiningClasses_Lab.P02_GettersAndSetters;

public class BankAccount {
    private int id;
    private double balance;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (0 <= amount && amount <= this.balance) {
            this.balance -= amount;
        }
    }
    
    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
