package L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.FelinePk;

import L08_Polymorphism_Exercises.P03_WildFarm.Food;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private static final String ANIMAL_TYPE_PLURAL = "Cats";
    private static final String SOUND = "Meowwww";
    private String breed;
    
    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        setBreed(breed);
    }
    
    // {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]
    public Cat(String[] animalInfo) {
        this(
                animalInfo[1],
                animalInfo[0],
                Double.parseDouble(animalInfo[2]),
                animalInfo[3],
                animalInfo[4]
        );
    }
    
    private void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getBreed() {
        return breed;
    }
    
    @Override
    protected void makeSound() {
        System.out.println(SOUND);
    }
    
    @Override
    protected void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat(super.DECIMAL_FORAMT_STRING);
        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                this.getBreed(),
                df.format(super.getAnimalWeight()),
                this.getLivingRegion(),
                super.getFoodEaten()
        );
    }
}
