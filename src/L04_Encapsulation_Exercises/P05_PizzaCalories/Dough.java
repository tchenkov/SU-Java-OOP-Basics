package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.util.HashMap;
import java.util.Map;

class Dough {
    private static final int CALORIES_MODIFIER = 2;
    private static final Map<String, Double> FLOUR_TYPE = new HashMap<>();
    private static final Map<String, Double> BAKING_TECHNIQUE = new HashMap<>();
    static {
        FLOUR_TYPE.put("White", 1.5);
        FLOUR_TYPE.put("Wholegrain", 1.0);
        BAKING_TECHNIQUE.putIfAbsent("Crispy", 0.9);
        BAKING_TECHNIQUE.putIfAbsent("Chewy", 1.1);
        BAKING_TECHNIQUE.putIfAbsent("Homemade", 1.0);
    }
    private static final int DOUGH_MIN_WEIGHT = 1;
    private static final int DOUGH_MAX_WEIGHT = 200;
    private static final String INVALID_DOUGH_TYPE = "Invalid type of dough.";
    private static final String INVALID_DOUGH_WEIGHT = "Dough weight should be in the range [1..200].";
    
    private String flourType;
    private String bakingTechnique;
    private double weight;
    
    Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }
    
    private void setFlourType(String flourType) {
        if (!FLOUR_TYPE.containsKey(flourType)){
            throw new IllegalArgumentException(INVALID_DOUGH_TYPE);
        }
        this.flourType = flourType;
    }
    
    private void setBakingTechnique(String bakingTechnique) {
        if (!BAKING_TECHNIQUE.containsKey(bakingTechnique)){
            throw new IllegalArgumentException(INVALID_DOUGH_TYPE);
        }
        this.bakingTechnique = bakingTechnique;
    }
    
    private void setWeight(double weight) {
        if (weight < DOUGH_MIN_WEIGHT || DOUGH_MAX_WEIGHT < weight){
            throw new IllegalArgumentException(INVALID_DOUGH_WEIGHT);
        }
        this.weight = weight;
    }
    
    double getCalories(){
        return this.weight * FLOUR_TYPE.get(this.flourType) *
                BAKING_TECHNIQUE.get(this.bakingTechnique) * CALORIES_MODIFIER;
    }
}
