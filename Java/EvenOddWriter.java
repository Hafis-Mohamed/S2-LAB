import java.util.Scanner;
import java.io.*;

public class EvenOddWriter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Source path :");
        String source=sc.nextLine();
        System.out.println("Enter Odd file path :");
        String odd=sc.nextLine();
        System.out.println("Enter Even file path :");
        String even=sc.nextLine();
        try{
            BufferedReader reader=new BufferedReader(new FileReader(source));
            BufferedWriter oddwriter=new BufferedWriter(new FileWriter(odd));
            BufferedWriter evenwriter=new BufferedWriter(new FileWriter(even));
            String line=reader.readLine();
            while(line!=null){
                int num=Integer.parseInt(line);
                if(num%2==1){
                    oddwriter.write(line +"\n");
                }
                else{
                    evenwriter.write(line+"\n");
                }
                line=reader.readLine();
            }
            sc.close();
            reader.close();
            oddwriter.close();
            evenwriter.close();
            System.out.println("Completed!!!!");
        }
        catch(Exception e){
            System.out.println("unable to open the file");
        }
    }

}
