package L02_DefiningClasses_Exercises.P11_CatLady;

public abstract class BaseCat {
    private String name;
    
    
    protected BaseCat(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s %s",
                this.getClass().getSimpleName(),
                this.name
        );
    }
}
