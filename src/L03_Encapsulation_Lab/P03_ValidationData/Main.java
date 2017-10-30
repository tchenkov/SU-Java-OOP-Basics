package L03_Encapsulation_Lab.P03_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int peopleCount = Integer.parseInt(br.readLine());
        
        List<Person> people = new LinkedList<>();
    
        for (int i = 0; i < peopleCount; i++) {
            String[] personInfo = br.readLine().split(" ");
            String firsName = personInfo[0];
            String lastName = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);
            double salary = Double.parseDouble(personInfo[3]);
            try {
                people.add(new Person(firsName, lastName, age, salary));
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        
        double bonus = Double.parseDouble(br.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
