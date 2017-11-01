package L04_Encapsulation_Exercises.P04_ShoppingSpree;

class Product {
    private String name;
    private double price;
    
    Product(String name, double price) {
        setName(name);
        setPrice(price);
    }
    
    private void setName(String name) {
        if (name == null || name.matches("^\\s*$")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    
    private void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }
    
    String getName() {
        return name;
    }
    
    double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
