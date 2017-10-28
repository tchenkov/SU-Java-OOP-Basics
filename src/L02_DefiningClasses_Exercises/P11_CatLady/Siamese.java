package L02_DefiningClasses_Exercises.P11_CatLady;

public class Siamese extends BaseCat {
    private double earSize;
    
    public Siamese(String name, double earSize) {
        super(name);
        this.earSize = earSize;
    }
    
    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), this.earSize);
    }
}
