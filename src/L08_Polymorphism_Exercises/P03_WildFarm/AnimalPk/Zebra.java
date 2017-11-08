package L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk;

import L08_Polymorphism_Exercises.P03_WildFarm.ErrorMessages;
import L08_Polymorphism_Exercises.P03_WildFarm.Food;

public class Zebra extends Mammal {
    private static final String ANIMAL_TYPE_PLURAL = "Zebras";
    private static final String PREFERRED_FOOD = "Vegetable";
    public static final String SOUND = "Zs";
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }
    
    // {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]
    public Zebra(String[] animalInfo) {
        this(
                animalInfo[1],
                animalInfo[0],
                Double.parseDouble(animalInfo[2]),
                animalInfo[3]
        );
    }
    
    @Override
    protected void makeSound() {
        System.out.println(SOUND);
    }
    
    @Override
    protected void eat(Food food) {
        if (food.getClass().getSimpleName().equals(PREFERRED_FOOD)){
            super.setFoodEaten(food.getQuantity());
        }
        else {
            throw new IllegalArgumentException(ErrorMessages.foodRejected(ANIMAL_TYPE_PLURAL));
        }
    }
}
