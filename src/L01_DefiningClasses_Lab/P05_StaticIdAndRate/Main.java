package L01_DefiningClasses_Lab.P05_StaticIdAndRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        
        String input = br.readLine();
        
        while (!input.equals("End")){
            String[] commands = input.split(" ");
            String instruction = commands[0];
            
            switch (instruction){
                case "Create":
                    createNewBankAccount(bankAccounts);
                    break;
                case "Deposit":
                    int depositId = Integer.parseInt(commands[1]);
                    double depositAmount = Double.parseDouble(commands[2]);
                    tryToDepositInBankAccount(depositId, depositAmount, bankAccounts);
                    break;
                case "SetInterest":
                    double newInterestRate = Double.parseDouble(commands[1]);
                    setNewInterestRate(newInterestRate);
                    break;
                case "GetInterest":
                    int accountId = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);
                    tryToGetInterest(accountId, years, bankAccounts);
            }
    
            input = br.readLine();
        }
    }
    
    private static void tryToGetInterest(int id, int years, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)){
            double interest = bankAccounts.get(id).getInterestRate(years);
            System.out.println(String.format("%.2f", interest));
        }
        else {
            BankAccount.printDoesNotExist();
        }
    }
    
    private static void setNewInterestRate(double newInterestRate) {
        BankAccount.setInterestRate(newInterestRate);
    }
    
    private static void tryToDepositInBankAccount(
            int id, double depositAmount, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id) && bankAccounts.get(id).deposit(depositAmount)){
            System.out.println(
                    String.format("Deposited %.0f to %s",
                            depositAmount, bankAccounts.get(id))
            );
        }
        else {
            BankAccount.printDoesNotExist();
        }
    }
    
    private static void createNewBankAccount(Map<Integer, BankAccount> bankAccounts) {
        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getId(), bankAccount);
        System.out.println(String.format("Account %s created", bankAccount));
    }
}
