import java.util.Scanner;

public class Semmetric {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter number of Matrix rows:");
        int r=ob.nextInt();

        System.out.println("Enter number of Matrix cols:");
        int c=ob.nextInt();

        int[][] a=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=ob.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        Boolean Symmetric=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]!=a[j][i]){
                    Symmetric=false;
                    break;
                }
            }
        }
        if(Symmetric==true){
            System.out.println("Matrix is Symmetric");
        }
        else{
            System.out.println("Matrix is not Symmetric");
        }
    }
}
