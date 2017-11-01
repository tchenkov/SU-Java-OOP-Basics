package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    private static final Map<String, Double> TOPPING_TYPE = new HashMap<>();
    static {
        TOPPING_TYPE.put("Meat", 1.2);
        TOPPING_TYPE.put("Veggies", 0.8);
        TOPPING_TYPE.putIfAbsent("Cheese", 1.1);
        TOPPING_TYPE.putIfAbsent("Sauce", 0.9);
    }

}
