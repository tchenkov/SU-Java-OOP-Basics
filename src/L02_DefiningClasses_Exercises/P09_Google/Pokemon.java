package L02_DefiningClasses_Exercises.P09_Google;

public class Pokemon {
    private String name;
    private String type;
    
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s%n", this.name, this.type);
    }
}
