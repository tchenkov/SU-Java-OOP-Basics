package L06_Inheritance_Exercises.P01_Person;

public class Child extends Person{
    private static final int MAX_AGE = 15;
    
    public Child(String name, int age) {
        super(name, age);
    }
    
    @Override
    protected void setAge(int age) {
        if (MAX_AGE < age){
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}
