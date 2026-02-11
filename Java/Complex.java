import java.util.Scanner;

public class Complex {

    int a,b;

    Complex(int a,int b){
        this.a=a;
        this.b=b;
    }

    void display(){
        System.out.println(a+"+i"+b);
    }

    static Complex add(Complex p1,Complex p2){
        Complex p3=new Complex(p1.a+p2.a,p1.b+p2.b);
        return p3;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the real and imaginery part of First Complex Number:");
        Complex c1=new Complex(sc.nextInt(),sc.nextInt());
        System.out.println("First Complex NUmber:");
        c1.display();

        System.out.println("Enter the real and imaginery part of Second Complex Number:");
        Complex c2=new Complex(sc.nextInt(),sc.nextInt());
        System.out.println("Second Complex NUmber:");
        c2.display();

        Complex added=add(c1,c2);
        System.out.println("Added Complex NUmber:");
        added.display();
        sc.close();
    }
}
