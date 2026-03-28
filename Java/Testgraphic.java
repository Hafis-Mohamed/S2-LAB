import graphics.*;

public class Testgraphic {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Square s = new Square(4);
        Triangle t = new Triangle(6, 3);
        Circle c = new Circle(7);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Square Area: " + s.area());
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Circle Area: " + c.area());
    }
}

