package L06_Inheritance_Exercises.P02_BookShop;

public class GoldenEditionBook extends Book{
    private static final double PRICE_PERCENT_MODIFIER = 30;
    private static final double PRICE_MODIFIER = PRICE_PERCENT_MODIFIER/100;
    
    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }
    
    @Override
    protected double getPrice() {
        return super.getPrice() + super.getPrice() * PRICE_MODIFIER;
    }
}
