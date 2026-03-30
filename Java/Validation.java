import java.util.*;

class nameException extends Exception{
    nameException(String s){
        super(s);
    }
}

class passException extends Exception{
    passException(String s){
        super(s);
    }
}

class User{
    String name,pass;
    
    User(String u,String p){
        name=u;
        pass=p;
    }

    void login(String n1,String p1){
        try{
            if(name.equals(n1)&&pass.equals(p1)){
                System.out.println("LOGIN SUCCESSFULL!!!!");
            }
            else{
                throw new nameException("Invalid username or password");
            }
        }
        catch(nameException e){
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
    }
}

public class Validation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username :");
        String Username=sc.next();
        try{
            for(int i=0;i<Username.length();i++){
                char ch=Username.charAt(i);
                if(ch>=65&&ch<=90||ch>=97&&ch<=122){
                    continue;
                }
                else{
                    throw new nameException("Invalid Username");
                }
            }
        }
        catch(nameException e){
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        System.out.println("Enter Password :");
        String Password=sc.next();
        try{
            if(Password.length()<8){
                throw new nameException("Password must be 8 charecters");
            }
            int p=0;
            for(int i=0;i<Password.length();i++){
                char ch=Password.charAt(i);
                if(ch>=48&&ch<=57){
                    p=1;
                }
            }   
            if(p==0){
                    throw new passException("Password must contain at least 1 number");
            }
        }
        catch(nameException e){
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        catch(passException e){
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        User u1=new User(Username,Password);
        System.out.println("-----LOGIN-----");
        System.out.println("Username :");
        String us=sc.next();
        System.out.println("Password :");
        String ps=sc.next();
        u1.login(us,ps);
        sc.close();
    }
}
