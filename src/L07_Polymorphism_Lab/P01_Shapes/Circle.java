package L07_Polymorphism_Lab.P01_Shapes;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();
    }
    
    public final double getRadius() {
        return radius;
    }
    
    @Override
    void calculatePerimeter() {
        super.setPerimeter(2 * Math.PI * this.radius);
    }
    
    @Override
    void calculateArea() {
        super.setArea(Math.PI * this.radius * this.radius);
    }
}
