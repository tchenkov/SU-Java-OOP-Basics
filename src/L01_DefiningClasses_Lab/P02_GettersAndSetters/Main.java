package L01_DefiningClasses_Lab.P02_GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();
        
        bankAccount.setId(1);
        bankAccount.deposit(15);
        bankAccount.withdraw(5);
        
        System.out.println(
                String.format(
                        "Account %s, balance %.2f",
                        bankAccount,
                        bankAccount.getBalance()
                )
        );
    }
}
