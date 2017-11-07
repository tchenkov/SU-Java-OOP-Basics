package L05_Inheritance_Lab.P04_FragileBaseClass;

public class Predator extends Animal {
    private int health;
    
    public Predator() {
        super();
        this.health = 0;
    }
    
 
    
    public void feed(Food food) {
        super.eat(food);
        this.health++;
    }
    
    public int getHealth() {
        return health;
    }
}
