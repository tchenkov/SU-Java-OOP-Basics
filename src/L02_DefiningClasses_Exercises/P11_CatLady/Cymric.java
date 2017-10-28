package L02_DefiningClasses_Exercises.P11_CatLady;

public class Cymric extends BaseCat {
    private double furLength;
    
    public Cymric(String name, double furLength) {
        super(name);
        this.furLength = furLength;
    }
    
    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), this.furLength);
    }
}
