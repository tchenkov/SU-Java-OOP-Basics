package L02_DefiningClasses_Exercises.P10_FamilyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<Integer, Person> people = new HashMap<>();
        getNewPerson(br.readLine(), people);
        
        getPeople(people, br);
        
        printPersonTies(people.get(1), people);
    }
    
    private static void printPersonTies(Person person, Map<Integer, Person> people) {
        printPerson(person);
        System.out.println("Parents:");
        person.getParentsIds().stream()
                .forEach(id -> printPerson(people.get(id)));
        System.out.println("Children:");
        person.getChildrenIds().stream()
                .forEach(id -> printPerson(people.get(id)));
    }
    
    private static void printPerson(Person person) {
        System.out.println(String.format("%s %s %s",
                        person.getFirstName(), person.getLastName(), person.getBirthday() ));
    }
    
    private static void getPeople(Map<Integer, Person> people, BufferedReader br) throws IOException {
        String line = br.readLine();
        while (!line.equals("End")) {
            String[] familyInfo = line.split(" - ");
            if (familyInfo.length == 2) {
                Person parent = getNewPerson(familyInfo[0], people);
                Person child = getNewPerson(familyInfo[1], people);
                
                if (!people.get(parent.getPersonId()).getChildrenIds().contains(child.getPersonId())) {
                    people.get(parent.getPersonId()).getChildrenIds().add(child.getPersonId());
                }
    
                if (!people.get(child.getPersonId()).getParentsIds().contains(parent.getPersonId())) {
                    people.get(child.getPersonId()).getParentsIds().add(parent.getPersonId());
                }
            }
            else {
                completePerson(line, people);
            }
            
            line = br.readLine();
        }
    }
    
    private static void completePerson(String line, Map<Integer, Person> people) {
        String[] personInfo = line.split(" ");
        String firstName = personInfo[0];
        String lastName = personInfo[1];
        String birthday = personInfo[2];
        
        boolean isFound = false;
        int firstHalfIndex = -1;
        for (Map.Entry<Integer, Person> person : people.entrySet()) {
            int secondHalfIndex = person.getKey();
            if (person.getValue().getBirthday().equals(birthday)) {
                if (!isFound) {
                    people.get(person.getKey()).setFirstName(firstName);
                    people.get(person.getKey()).setLastName(lastName);
                    firstHalfIndex = person.getKey();
                    isFound = true;
                    continue;
                }
                else {
                    trimAndFixTies(firstHalfIndex, secondHalfIndex, people);
                    return;
                }
            }
            
            if (person.getValue().getFirstName().equals(firstName) &&
                    person.getValue().getLastName().equals(lastName)) {
                if (!isFound) {
                    people.get(person.getKey()).setBirthday(birthday);
                    firstHalfIndex = person.getKey();
                    isFound = true;
                    continue;
                }
                else {
                    trimAndFixTies(firstHalfIndex, secondHalfIndex, people);
                    return;
                }
            }
        }
    }
    
    private static void trimAndFixTies(int firstHalfIndex, int secondHalfIndex, Map<Integer, Person> people) {
        Person completePerson = people.get(firstHalfIndex);
        Person incompletePerson = people.get(secondHalfIndex);
        
        for (Integer parentId : incompletePerson.getParentsIds()) {
            if (!completePerson.getParentsIds().contains(parentId)) {
                completePerson.getParentsIds().add(parentId);
            }
        }
        
        for (Integer childId : incompletePerson.getChildrenIds()) {
            if (!completePerson.getChildrenIds().contains(childId)) {
                completePerson.getChildrenIds().add(childId);
            }
        }
    
        for (Map.Entry<Integer, Person> person : people.entrySet()) {
            if (person.getValue().getParentsIds().contains(secondHalfIndex)){
                int index = people.get(person.getKey()).getParentsIds().indexOf(secondHalfIndex);
                people.get(person.getKey()).getParentsIds().set(index, firstHalfIndex);
            }
            
            if (person.getValue().getChildrenIds().contains(secondHalfIndex)){
                int index = people.get(person.getKey()).getChildrenIds().indexOf(secondHalfIndex);
                people.get(person.getKey()).getChildrenIds().set(index, firstHalfIndex);
            }
        }
    
        people.put(firstHalfIndex, completePerson);
        people.remove(secondHalfIndex);
    }
    
    private static Person getNewPerson(String input, Map<Integer, Person> people) {
        if (input.contains("/")) {
            for (Person person : people.values()) {
                if (person.getBirthday().equals(input)){
                    return people.get(person.getPersonId());
                }
            }
            
            Person person = new Person(input);
            people.putIfAbsent(person.getPersonId(), person);
            return person;
        }
        String firstName = input.split(" ")[0];
        String lastName = input.split(" ")[1];
    
        for (Person person : people.values()) {
            if (person.getFirstName().equals(firstName) &&
                    person.getLastName().equals(lastName)){
                return people.get(person.getPersonId());
            }
        }
        
        Person person = new Person(firstName, lastName);
        people.putIfAbsent(person.getPersonId(), person);
        
        return person;
    }
}
