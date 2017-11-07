package L05_Inheritance_Lab.P04_FragileBaseClass;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        predator.eat(new Food());
        System.out.println(predator.getHealth());
        predator.eatAll(new Food[]{new Food(), new Food(), new Food()});
        System.out.println(predator.getHealth());
    }
}
