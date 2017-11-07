package L06_Inheritance_Exercises.P02_BookShop;

public class Book {
    private static final int TITLE_MIN_LENGTH = 3;
    private static final int PRICE_MIN_VALUE = 0;
    
    private String author;
    private String title;
    private double price;
    
    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }
    
    private void setAuthor(String author) {
        if (author.matches("^[^\\s]+\\s[\\d][^\\s]+$")){
            throw new IllegalArgumentException("Author not valid!");
        }
        this.author = author;
    }
    
    private void setTitle(String title) {
        if (title == null || title.length() < TITLE_MIN_LENGTH){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }
    
    private void setPrice(double price) {
        if (price  <= PRICE_MIN_VALUE){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }
    
    private String getAuthor() {
        return author;
    }
    
    private String getTitle() {
        return title;
    }
    
    protected double getPrice() {
        return price;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
