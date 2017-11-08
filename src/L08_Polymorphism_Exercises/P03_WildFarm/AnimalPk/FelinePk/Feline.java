package L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.FelinePk;

import L08_Polymorphism_Exercises.P03_WildFarm.AnimalPk.Mammal;

public abstract class Feline extends Mammal {
    public Feline(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }
}
