package graphics;

public class Circle implements Figure{
    double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return 3.14*radius*radius;
    }
}
