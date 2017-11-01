package L04_Encapsulation_Exercises.P04_ShoppingSpree;

import java.util.LinkedList;
import java.util.List;

class Person {
    public static final String NO_PRODUCTS_BOUGHT = "Nothing bought";
    
    private String name;
    private double budget;
    private List<Product> shoppingBasket;
    
    Person(String name, double budget) {
        setName(name);
        setBudget(budget);
        this.shoppingBasket = new LinkedList<>();
    }
    
    private void setName(String name) {
        if (name == null || name.matches("^\\s*$")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    
    private void setBudget(double budget) {
        if (budget < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.budget = budget;
    }
    
    String getName() {
        return name;
    }
    
    void buyProduct(Product product){
        if (this.budget < product.getPrice()){
            throw new IllegalArgumentException(this.name + " can't afford " + product.getName());
        }
        this.budget -= product.getPrice();
        this.shoppingBasket.add(product);
    }
    
    String getProductsBought(){
        return this.shoppingBasket.size() != 0 ?
                this.shoppingBasket.toString().replaceAll("[\\[\\]]", "") :
                NO_PRODUCTS_BOUGHT;
    }
    
    @Override
    public String toString() {
        return this.name + " - " + this.getProductsBought();
    }
}
