package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.util.HashMap;
import java.util.Map;

class Dough {
    private static final Map<String, Double> FLOUR_TYPE = new HashMap<>();
    private static final Map<String, Double> BAKING_TECHNIQUE = new HashMap<>();
    static {
        FLOUR_TYPE.put("White", 1.5);
        FLOUR_TYPE.put("Wholegrain", 1.0);
        BAKING_TECHNIQUE.putIfAbsent("Crispy", 0.9);
        BAKING_TECHNIQUE.putIfAbsent("Chewy", 1.1);
        BAKING_TECHNIQUE.putIfAbsent("Homemade", 1.0);
    }
    
    private double weight;
    
    Dough(double weight) {
        this.weight = weight;
    }
}
