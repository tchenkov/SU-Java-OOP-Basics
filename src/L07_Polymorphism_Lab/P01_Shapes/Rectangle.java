package L07_Polymorphism_Lab.P01_Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.calculatePerimeter();
        this.calculateArea();
    }
    
    public final double getHeight() {
        return height;
    }
    
    public final double getWidth() {
        return width;
    }
    
    @Override
    void calculatePerimeter() {
        super.setPerimeter((this.width + this.height)* 2);
    }
    
    @Override
    void calculateArea() {
        super.setArea(this.width * this.height);
    }
}
