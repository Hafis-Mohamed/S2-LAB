import java.util.Scanner;

public class Matrixadd {

    static void createMatrix(int r,int c,int a[][],Scanner ob){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=ob.nextInt();
            }
        }
    }

    static void displayMatrix(int r,int c,int matrix[][]){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int r,int c,int a[][],int b[][]){
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Added Matrix is:");
        displayMatrix(r,c,matrix);
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter the number of rows in matrices:");
        int r=ob.nextInt();
        System.out.println("Enter the number of coloumns of matrices:");
        int c=ob.nextInt();
        
        int[][] a=new int[r][c];
        System.out.println("Enter the elements of First matrix:");
        createMatrix(r,c,a,ob);
        System.out.println("First Matrix is:");
        displayMatrix(r,c,a);

        int[][] b=new int[r][c];
        System.out.println("Enter the elements of Second matrix:");
        createMatrix(r,c,b,ob);
        System.out.println("Second Matrix is:");       
        displayMatrix(r,c,b);

        System.out.println("Matrix Adding......");
        addMatrix(r,c,a,b);
        ob.close();
    }
}
