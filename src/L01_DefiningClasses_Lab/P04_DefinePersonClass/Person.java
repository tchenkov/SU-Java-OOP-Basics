package L01_DefiningClasses_Lab.P04_DefinePersonClass;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> bankAccounts;
    
    public Person(String name, int age) {
        this(name, age, new ArrayList<>());
    }
    
    public Person(String name, int age, List<BankAccount> bankAccounts) {
        this.name = name;
        this.age = age;
        this.bankAccounts = bankAccounts;
    }
    
    public double getBallance(){
        return this.bankAccounts.stream().mapToDouble(acc -> acc.getBalance()).sum();
    }
}
