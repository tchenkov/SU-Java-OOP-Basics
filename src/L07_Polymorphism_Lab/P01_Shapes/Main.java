package L07_Polymorphism_Lab.P01_Shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(2, 5);
    
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println();
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());
    }
}
