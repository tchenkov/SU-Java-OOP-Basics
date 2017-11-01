package L04_Encapsulation_Exercises.P01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;
    
    Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    
    private void setLength(double length) {
        this.length = length;
    }
    
    private void setWidth(double width) {
        this.width = width;
    }
    
    private void setHeight(double height) {
        this.height = height;
    }
    
    double getSurfaceArea(){
        return (this.length * this.width + this.width * this.height + this.height * this.length) * 2;
    }
    
    double getLateralSurfaceArea(){
        return (this.length * this.height + this.width * this.height) * 2;
    }
    
    double getVolume(){
        return this.length * this.width * this.height;
    }
}
