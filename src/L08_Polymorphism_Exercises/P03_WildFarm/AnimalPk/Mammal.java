package L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk;

import L08_Polymorphism_Exercises.P03_WildFarm.Animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    
    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        setLivingRegion(livingRegion);
    }
    
    private void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
    
    public String getLivingRegion() {
        return livingRegion;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat(super.DECIMAL_FORAMT_STRING);
        return String.format("%s[%s, %s, %s, %d]",
                super.getAnimalType(),
                super.getAnimalName(),
                df.format(super.getAnimalWeight()),
                this.getLivingRegion(),
                super.getFoodEaten()
        );
    }
}
