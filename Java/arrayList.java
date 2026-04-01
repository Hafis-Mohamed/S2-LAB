import java.util.*;

public class arrayList {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        ArrayList<String> Arr=new ArrayList<>();
        int ch;
        int index;
        String val;
        do{
            System.out.println("\n 1 for ADD \n 2 for SIZE \n 3 for SEARCH BY INDEX \n 4 for FIND INDEX \n 5 for CONTAINS \n 6 for REMOVE \n 7 for REMOVE BY INDEX \n 8 for DISPLAY \n 9 for CLEAR \n 0 for EXIT \n");
            System.out.println("Enter ur CHOICE");
            ch=ob.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Element :");
                    val=ob.next();
                    Arr.add(val);
                    break;
                case 2:
                    System.out.println("Size :"+Arr.size());
                    break;
                case 3:
                    System.out.println("Enter the index to be Searched :");
                    index=ob.nextInt();
                    System.out.println("Element "+Arr.get(index)+" is at index "+index);
                    break;
                case 4:
                    System.out.println("Element :");
                    val=ob.next();
                    System.out.println(val+" is present at "+Arr.indexOf(val));
                    break;
                case 5:
                    System.out.println("Element :");
                    val=ob.next();
                    if(Arr.contains(val)){
                        System.out.println(val+" is contained in ArrayList");
                    }
                    else{
                        System.out.println(val+" is not contained in ArrayList");
                    }
                    case 6:
                        System.out.println("Enter the elemnt to be removed :");
                        val=ob.next();
                        boolean remove=Arr.remove(val);
                        if(remove){
                            System.out.println(val+" removed from the ArrayList");
                        }
                        else{
                            System.out.println(val+" is present in the ArrayList");
                        }
                        break;
                    case 7:
                        System.out.println("Enter the index of element to be removed :");
                        index=ob.nextInt();
                        Arr.remove(index);
                        System.out.println("Element on index "+index+" is removed");    
                        break;
                    case 8:
                        System.out.println("ArrayList :"+Arr);
                        break;
                    case 9:
                        Arr.clear();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
        }while(ch!=0);
    }
}
