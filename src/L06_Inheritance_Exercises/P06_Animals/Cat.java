package L06_Inheritance_Exercises.P06_Animals;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    void produceSound() {
        System.out.println("MiauMiau");
    }
}
