package L02_DefiningClasses_Exercises.P01_DefineClassPerson;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class person = Person.class;
    
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
        
        Person pesho = new Person() {{
            setName("Pesho");
            setAge(20);
        }};
        
        Person gosho = new Person();
        gosho.setName("Gosho");
        gosho.setAge(18);
        
        Person stamat = new Person("Stamat", 43);
        
    }
}
