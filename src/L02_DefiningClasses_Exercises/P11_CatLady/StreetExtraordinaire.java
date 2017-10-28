package L02_DefiningClasses_Exercises.P11_CatLady;

public class StreetExtraordinaire extends BaseCat {
    private double decibelsOfMeows;
    
    public StreetExtraordinaire(String name, double decibelsOfMeows) {
        super(name);
        this.decibelsOfMeows = decibelsOfMeows;
    }
    
    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), this.decibelsOfMeows);
    }
}
