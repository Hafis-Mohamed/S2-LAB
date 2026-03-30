import java.util.Scanner;

class negativeException extends Exception{
    negativeException(String s){
        super(s);
    }
}

public class Average {
    public static void main(String args[]){
        Integer sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        Integer n=sc.nextInt();
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            Integer num=sc.nextInt();
            try{
                if(num<0){
                    throw new negativeException("Number cannot be negative!!!");
                }
                else{
                    sum=sum+num;
                }
            }
            catch(negativeException e){
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
        }
        double avg = sum / (double)n;
        System.out.printf("Average of these numbers: %.2f\n", avg);
    }
}
