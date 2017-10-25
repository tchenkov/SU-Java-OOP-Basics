package L01_DefiningClasses_Lab.P05_StaticIdAndRate;

public class BankAccount {
    private static final double DEFAULT_INTEREST_RATE = 0.02;
    
    private static double rate = DEFAULT_INTEREST_RATE;
    private static int bankAccountsCount;
    
    private int id;
    private double balance;
    
    public BankAccount() {
        this.id = ++bankAccountsCount;
    }
    
    public int getId() {
        return id;
    }
    
    public static void setInterestRate(double interest) {
        BankAccount.rate = interest;
    }
    
    public double getInterestRate(int years) {
        return this.balance * rate * years;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            return true;
        }
        
        return false;
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
