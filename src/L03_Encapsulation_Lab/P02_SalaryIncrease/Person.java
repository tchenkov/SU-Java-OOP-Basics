package L03_Encapsulation_Lab.P02_SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    
    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
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
    
    private double getSalary() {
        return salary;
    }
    
    private void setSalary(double salary) {
        this.salary = salary;
    }
    
    void increaseSalary(double bonus) {
        if (this.age < 30){
            bonus /= 2;
        }
        this.salary += this.salary * bonus / 100;
        
    }
    
    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " gets " + this.getSalary() + " leva";
    }
}
