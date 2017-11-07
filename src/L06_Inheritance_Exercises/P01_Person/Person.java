package L06_Inheritance_Exercises.P01_Person;

public class Person {
    private static final int MIN_AGE = 1;
    private static final int MIN_NAME_LENGTH = 3;
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    
    protected void setName(String name) {
        if (name == null || name.trim().length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }
    
    protected void setAge(int age) {
        if (age < MIN_AGE){
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }
    
    protected String getName() {
        return this.name;
    }
    
    protected int getAge() {
        return this.age;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Name: %s, Age: %d",
                this.getName(),
                this.getAge()
        );
    }
}
