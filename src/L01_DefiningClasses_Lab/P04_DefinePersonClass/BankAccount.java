package L01_DefiningClasses_Lab.P04_DefinePersonClass;

public class BankAccount {
    private int id;
    private double balance;
    
    public BankAccount(int id) {
        this.id = id;
    }
    
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
        else {
            System.out.println("Insufficient balance");
        }
    }
    
    public static void printDoesNotExist() {
        System.out.println("Account does not exist");
    }
    
    public static void printAlreadyExist() {
        System.out.println("Account already exists");
    }
    
    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
