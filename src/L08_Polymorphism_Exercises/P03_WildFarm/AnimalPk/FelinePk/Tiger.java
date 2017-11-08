package L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.FelinePk;

import L08_Polymorphism_Exercises.P03_WildFarm.ErrorMessages;
import L08_Polymorphism_Exercises.P03_WildFarm.Food;

public class Tiger extends Feline {
    private static final String ANIMAL_TYPE_PLURAL = "Tigers";
    private static final String PREFERRED_FOOD = "Meat";
    private static final String SOUND = "ROAAR!!!";
    //private String livingRegion; ??
    
    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }
    
    // {AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]
    public Tiger(String[] animalInfo) {
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
