package L02_DefiningClasses_Exercises.P06_RawData;

public class Cargo {
    private int weight;
    private String type;
    
    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}
