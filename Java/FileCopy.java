import java.io.*;

public class FileCopy {
    public static void main(String[] args){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.println("Enter Source File Path :");
        String source=reader.readLine();
        System.out.println("Enter Destination File Path :");
        String destination=reader.readLine();
        byte[] buffer=new byte[1024];
        FileInputStream input=new FileInputStream(new File(source));
        FileOutputStream output=new FileOutputStream(new File(destination));
        buffer=input.readAllBytes();
        output.write(buffer);
        output.close();
        input.close();
        System.out.println("File Copied");
        }
        catch(Exception e){
            System.err.println(e);
        }   
    }
}
