import java.util.Scanner;

class mutiple5 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i+" x 5 = "+ (i*5) );
        }
    }
}

class prime extends Thread{
    int n;
    prime(int limit){
        n=limit;
    }
    int isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void run(){
        for(int i=0;i<n;i++){
            if(isprime(i)==1){
                System.out.println("Prime :"+i);
            }
        }
    }
}

public class Threads {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        mutiple5 m=new mutiple5();
        System.out.println("Enter limit for generating prime :");
        int n=sc.nextInt();
        prime m1=new prime(n);
        m1.start();
        m.start();
    }
}
