package L06_Inheritance_Exercises.P04_MordorsCrueltyPlan;

import java.util.HashMap;
import java.util.Map;

class Food {
    private static final int UNKNOWN_FOOD_HAPPINESS = -1;
    private static final Map<String, Integer> foodHappiness = new HashMap<>();
    static {
        foodHappiness.put("cram", 2);
        foodHappiness.put("lembas", 3);
        foodHappiness.put("apple", 1);
        foodHappiness.put("melon", 1);
        foodHappiness.put("honeycake", 5);
        foodHappiness.put("mushrooms", -10);
    }
    
    private String name;
    
    Food(String name) {
        this.name = name;
    }
    
    int getHappiness(){
        if (foodHappiness.containsKey(this.name.toLowerCase())){
            return foodHappiness.get(this.name.toLowerCase());
        }
        
        return UNKNOWN_FOOD_HAPPINESS;
    }
}
