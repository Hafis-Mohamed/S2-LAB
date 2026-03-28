import java.io.File;
import java.util.Scanner;

public class FileSearch {

    static Boolean fileFound=false;
    static String filePath=null;

    static void listFile(File directory){
        if(directory.isDirectory()){
            System.out.println("FILE UNDER : "+directory.getName());
            File[] contents=directory.listFiles();
            for(File file:contents){
                System.out.println(file.getName());
                listFile(file);
            }
        }
    }

    static void searchFile(File directory,String search){
        if(directory.isDirectory() && !fileFound){
            File[] files=directory.listFiles();
            for(File file:files){
                if(file.getName().equals(search)){
                    fileFound=true;
                    filePath=file.getAbsolutePath();
                    return;
                }
            }
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFile(file, search);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the DIRECTORY PATH");
        String dirpath=sc.nextLine();
        File directory=new File(dirpath);
        if(directory.isDirectory()){
            System.out.println("File and Directories");
            listFile(directory);
            System.out.println("Enter the name of file to be searched :");
            String search=sc.next();
            searchFile(directory,search);
            if (fileFound) {
                System.out.println("File Path=" + filePath);
            } else {
                System.out.println("File Not found");
            }
        } 
        else {
            System.out.println("Not a valid directory");
        }
    }
}
