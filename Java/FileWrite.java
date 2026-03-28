import java.util.Scanner;
import java.io.*;

public class FileWrite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter file name:");
    String filename=sc.nextLine();
    try{
        FileOutputStream output=new FileOutputStream(filename);
        System.out.println("Write the content :");
        String content=sc.nextLine();
        output.write(content.getBytes());
        output.close();
        FileInputStream input=new FileInputStream(filename);
        int data=input.read();
        System.out.println("File Content :");
        while(data!=-1){
            System.out.print((char)data);
            data=input.read();
        }
        input.close();
        }
    catch(Exception e){
        System.out.println("Unable to create file");
    }
    }
}
