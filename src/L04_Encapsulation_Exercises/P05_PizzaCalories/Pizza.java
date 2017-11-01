package L04_Encapsulation_Exercises.P05_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private static final int NAME_MIN_LENGTH = 1;
    private static final int NAME_MAX_LENGTH = 15;
    private static final int MIN_TOPPINGS_COUNT = 0;
    private static final int MAX_TOPPINGS_COUNT = 10;
    private String name;
    private int toppingsCount;
    private List<Topping> toppings;
    private Dough dough;
    
    Pizza(String name, int toppingsCount) {
        setName(name);
        setToppingsCount(toppingsCount);
        setToppings(toppingsCount);
    }
    
    private void setName(String name) {
        if (name == null || name.length() < NAME_MIN_LENGTH || NAME_MAX_LENGTH < name.length()){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
    
    private void setToppingsCount(int toppingsCount) {
        if (toppingsCount < MIN_TOPPINGS_COUNT || MAX_TOPPINGS_COUNT < toppingsCount){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingsCount = toppingsCount;
    }
    
    private void setToppings(int toppingsCount) {
        this.toppings = new ArrayList<>(toppingsCount);
    }
    
    void setDough(Dough dough) {
        this.dough = dough;
    }
    
    void addTopping(Topping topping) {
        this.toppings.add(topping);
    }
    
    private double getCalories() {
        double doughCalories = this.dough.getCalories();
        double toppingsCalories = this.toppings.stream().mapToDouble(Topping::getCalories).sum();
        return doughCalories + toppingsCalories;
    }
    
    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, this.getCalories());
    }
}
