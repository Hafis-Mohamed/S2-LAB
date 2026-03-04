import java.util.Scanner;

public class Searching {
    public static void search(int Arr[],int target,int n){
        boolean found=false;
        for (int i=0;i<n;i++){
            if(Arr[i]==target){
                System.out.println("The element is present at the location "+i);
                found=true;
                break;
            }
        }
        if(!found){
                System.out.println("Element not found in the Array");
            }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            A[i]=m;
        }
        System.out.println("Enter the element to be searched:");
        int target=sc.nextInt();
        search(A,target,n);
        sc.close();
    } 
}
