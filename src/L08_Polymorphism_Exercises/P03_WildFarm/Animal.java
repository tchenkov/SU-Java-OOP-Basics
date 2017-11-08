package L08_Polymorphism_Exercises.P03_WildFarm;

public abstract class Animal {
    private static final int DEFAULT_FOOD_EATEN_QUANTITY = 0;
    protected static final String DECIMAL_FORAMT_STRING = "#.##";
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;
    
    public Animal(String animalName, String animalType, double animalWeight) {
        setAnimalName(animalName);
        setAnimalType(animalType);
        setAnimalWeight(animalWeight);
        setFoodEaten(DEFAULT_FOOD_EATEN_QUANTITY);
    }
    
    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    
    private void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    
    private void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }
    
    protected void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
    
    protected String getAnimalName() {
        return animalName;
    }
    
    protected String getAnimalType() {
        return animalType;
    }
    
    protected double getAnimalWeight() {
        return animalWeight;
    }
    
    protected int getFoodEaten() {
        return foodEaten;
    }
    
    protected void addFood(int quantity){
        this.foodEaten += quantity;
    }
    
    protected abstract void makeSound();
    protected abstract void eat(Food food);
    
    @Override
    public String toString() {
        return super.toString();
    }
}
