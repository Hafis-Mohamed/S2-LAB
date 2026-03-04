import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();

        String lower=str.toLowerCase();
        System.out.println("String in LowerCase:"+lower);

        String upper=str.toUpperCase();
        System.out.println("String in UpperCase:"+upper);
        
        int len=str.length();
        System.out.println("Length of string:"+len);

        String t=str.trim();
        System.out.println("Trimmed string:"+t);

        System.out.println("Enter string to search:");
        String search=sc.nextLine();
        boolean s=str.contains(search);
        if(s==true){
            System.out.println(search+" contained in String");
        }
        else{
            System.out.println(search+" not conatined in str");
        }

        System.out.println("Enter string to concat:");
        String con=sc.nextLine();
        System.out.println("String after concatination:"+str.concat(con));
        
        System.out.println("Trimmed string: " + str.trim());
        sc.close();
    }
}
