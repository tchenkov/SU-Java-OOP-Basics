package L01_DefiningClasses_Lab.P03_TestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();
        
        
        String command = br.readLine();
        
        while (!command.equals("End")){
            String[] commandsArr = command.split(" ");
            
            String instruction = commandsArr[0];
            int id = Integer.parseInt(commandsArr[1]);
            
            switch (instruction){
                case "Create":
                    tryToCreateNewBankAccount(id, bankAccounts);
                    break;
                case "Deposit":
                    double depositAmount = Double.parseDouble(commandsArr[2]);
                    tryToDepositInBankAccount(id, depositAmount, bankAccounts);
                    break;
                case "Withdraw":
                    double withdrawAmount = Double.parseDouble(commandsArr[2]);
                    tryToWithdrawFromBankAccount(id, withdrawAmount, bankAccounts);
                    break;
                case "Print":
                    tryToPrintBankAccount(id, bankAccounts);
            }
            
            command = br.readLine();
        }
    }
    
    private static void tryToPrintBankAccount(int id, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)){
            System.out.println(
                    String.format("Account %s, balance %.2f",
                            bankAccounts.get(id), bankAccounts.get(id).getBalance())
            );
        }
        else {
            BankAccount.printDoesNotExist();
        }
    }
    
    private static void tryToWithdrawFromBankAccount(
            int id, double withdrawAmount, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)){
            bankAccounts.get(id).withdraw(withdrawAmount);
        }
        else {
            BankAccount.printDoesNotExist();
        }
    }
    
    private static void tryToDepositInBankAccount(
            int id, double depositAmount, Map<Integer, BankAccount> bankAccounts) {
        if (bankAccounts.containsKey(id)){
            bankAccounts.get(id).deposit(depositAmount);
        }
        else {
            BankAccount.printDoesNotExist();
        }
    }
    
    private static void tryToCreateNewBankAccount(
            int id, Map<Integer, BankAccount> bankAccounts) {
        if (!bankAccounts.containsKey(id)){
            bankAccounts.put(id, new BankAccount(id));
        }
        else {
            BankAccount.printAlreadyExist();
        }
    }
}
