package L06_Inheritance_Exercises.P06_Animals;

public class Kitten extends Cat {
    static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }
    
    @Override
    void produceSound() {
        System.out.println("Miau");
    }
}
