package L04_Encapsulation_Exercises.P03_AnimalFarm;

public class Chicken {
    private static final int YOUNG_CHICKEN_MAX_AGE = 6;
    private static final int YOUNG_CHICKEN_EGGS_PER_DAY = 2;
    private static final int OLDER_CHICKEN_MAX_AGE = 12;
    private static final int OLDER_CHICKEN_EGGS_PER_DAY = 1;
    private static final int OLDEST_CHICKEN_MAX_AGE = 15;
    private static final double OLDEST_CHICKEN_EGGS_PER_DAY = 0.75;
    
    private String name;
    private int age;
    
    Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }
    
    private void setName(String name) {
        if (name == null || name.matches("^\\s*$")){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
    
    private void setAge(int age) {
        if (age < 0 || OLDEST_CHICKEN_MAX_AGE < age){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    
    private String getEggsPerDay(){
        if (this.age < YOUNG_CHICKEN_MAX_AGE){
            return String.valueOf(YOUNG_CHICKEN_EGGS_PER_DAY);
        }
        
        if (this.age < OLDER_CHICKEN_MAX_AGE){
            return String.valueOf(OLDER_CHICKEN_EGGS_PER_DAY);
        }
        return String.valueOf(OLDEST_CHICKEN_EGGS_PER_DAY);
    }
    
    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",
                this.name, this.age, this.getEggsPerDay());
    }
}
