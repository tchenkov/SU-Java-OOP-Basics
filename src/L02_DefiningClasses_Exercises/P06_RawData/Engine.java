package L02_DefiningClasses_Exercises.P06_RawData;

public class Engine {
    private int speed;
    private int power;
    
    public Engine(int engineSpeed, int enginePower) {
        this.speed = engineSpeed;
        this.power = enginePower;
    }
    
    public int getPower() {
        return power;
    }
}
