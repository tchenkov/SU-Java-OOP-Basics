package L03_Encapsulation_Lab.P02_SalaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int peopleCount = Integer.parseInt(br.readLine());
        
        Person[] people = new Person[peopleCount];
    
        for (int i = 0; i < peopleCount; i++) {
            String[] personInfo = br.readLine().split(" ");
            String firsName = personInfo[0];
            String lastName = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);
            double salary = Double.parseDouble(personInfo[3]);
            people[i] = new Person(firsName, lastName, age, salary);
        }
        
        double bonus = Double.parseDouble(br.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
