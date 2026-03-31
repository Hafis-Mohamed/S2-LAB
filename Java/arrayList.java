import java.util.*;

public class arrayList {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        ArrayList<String> Arr=new ArrayList<>();
        int ch;
        do{
            System.out.println("\n 1 for ADD \n 2 for SIZE \n 3 for SEARCH BY INDEX \n 4 for FIND INDEX \n 5 for CONTAINS \n 6 for REMOVE \n 7 for REMOVE BY INDEX \n 8 for DISPLAY \n 9 for CLEAR \n 0 for EXIT \n");
            System.out.println("Enter ur CHOICE");
            ch=ob.nextInt();
            
        }while(ch!=0);
    }
}
