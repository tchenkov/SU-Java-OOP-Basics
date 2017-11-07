package L06_Inheritance_Exercises.P06_Animals;

public class Tomcat extends Cat {
    static final String GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }
    
    @Override
    void produceSound() {
        System.out.println("Give me one million b***h");
    }
}
