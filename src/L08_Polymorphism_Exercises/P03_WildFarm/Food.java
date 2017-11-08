package L08_Polymorphism_Exercises.P03_WildFarm;

public abstract class Food {
    private int quantity;
    
    public Food(int quantity) {
        setQuantity(quantity);
    }
    
    private void setQuantity(int quantity) {
        this.quantity = quantity <= 0 ? 0 : quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
}
