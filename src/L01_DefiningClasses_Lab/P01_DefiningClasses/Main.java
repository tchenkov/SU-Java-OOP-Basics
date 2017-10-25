package L01_DefiningClasses_Lab.P01_DefiningClasses;

public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();
        
        bankAccount.id = 1;
        bankAccount.balance = 15;
    
        System.out.println(
                String.format("Account ID%d, balance %.2f",
                        bankAccount.id, bankAccount.balance)
        );
    }
}
