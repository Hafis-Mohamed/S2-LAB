package graphics;

public class Square implements Figure{
    double side;

    public Square(double side){
        this.side=side;
    }

    public double area(){
        return side*side;
    }
}
