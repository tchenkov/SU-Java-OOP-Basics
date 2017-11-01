package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    private static final int CALORIES_MODIFIER = 2;
    private static final Map<String, Double> TOPPING_TYPE = new HashMap<>();
    static {
        TOPPING_TYPE.put("Meat", 1.2);
        TOPPING_TYPE.put("Veggies", 0.8);
        TOPPING_TYPE.putIfAbsent("Cheese", 1.1);
        TOPPING_TYPE.putIfAbsent("Sauce", 0.9);
    }
    
    private String toppingType;
    private double weight;
    
    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }
    
    private void setToppingType(String toppingType) {
        if (!TOPPING_TYPE.containsKey(toppingType)){
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }
    
    private void setWeight(double weight) {
        if (weight < 1 || 50 < weight){
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }
    
    double getCalories(){
        return TOPPING_TYPE.get(this.toppingType) * this.weight * CALORIES_MODIFIER;
    }
}
