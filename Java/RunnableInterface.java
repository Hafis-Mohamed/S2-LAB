import java.util.Scanner;

class fibo implements Runnable{
    int n;
    fibo(int limit){
        n=limit;
    }
    public void run(){
        int a=0,b=1,c;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}

class even implements Runnable{
    int start,end;
    even(int s,int e){
        start=s;
        end=e;
    }
    public void run(){
        for(int i=start;i<=end;i++){
            if (i%2==0){
                System.out.println("Even :"+i);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit fot fibonacci series :");
        int no=sc.nextInt();
        System.out.println("Enter start and end of even numbers :");
        int s=sc.nextInt();
        int e=sc.nextInt();
        Thread f1=new Thread(new fibo(no));
        Thread e1=new Thread(new even(s,e));
        f1.start();
        e1.start();
        sc.close();
    }
}
