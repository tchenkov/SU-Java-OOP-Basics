package L07_Polymorphism_Lab.P01_Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;
    
    void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    void setArea(double area) {
        this.area = area;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public double getArea() {
        return area;
    }
    
    abstract void calculatePerimeter();
    abstract void calculateArea();
}
