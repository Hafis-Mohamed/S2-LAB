
public class Shape {
    void area(int a){
        System.out.println("Area of Square is:"+(a*a));
    }
    void area(int a,int b){
        System.out.println("Area of Rectangle is:"+(a*b));
    }
    void area(double a){
        System.out.println("Area of circle is:"+(3.14*a*a));
    }
    public static void main(String[] args){
        Shape s=new Shape();
        s.area(6);
        s.area(5.0);
        s.area(5,6);
    }
}
