package L02_DefiningClasses_Exercises.P03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int peopleCount = Integer.parseInt(br.readLine());
        Person[] people = getPeople(peopleCount, br);
    
        Arrays.stream(people)
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
    
    private static Person[] getPeople(int peopleCount, BufferedReader br) throws IOException {
        Person[] people = new Person[peopleCount];
        for (int i = 0; i < peopleCount; i++) {
            String[] personInfo = br.readLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
        
            people[i] = new Person(name, age);
        }
        return people;
    }
}
