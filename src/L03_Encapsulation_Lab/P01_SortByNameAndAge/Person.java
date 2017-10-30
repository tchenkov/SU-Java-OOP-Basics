package L03_Encapsulation_Lab.P01_SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }
    
    String getFirstName() {
        return firstName;
    }
    
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    private String getLastName() {
        return lastName;
    }
    
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    int getAge() {
        return age;
    }
    
    private void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s is %d years old.",
                this.getFirstName(), this.getLastName(), this.getAge());
    }
}
