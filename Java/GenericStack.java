import java.util.*;

class Stack<T>{
    ArrayList<T> Arr;
    int top=-1;
    int size;

    Stack(int size){
        this.size=size;
        this.Arr=new ArrayList<T>(size);
    }

    void push(T x){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return ;
        }
        else{
            top=top+1;
            if(Arr.size()>top){
                Arr.set(top,x);
            }
            else{
                Arr.add(x);
            }
        }
    }

    T GetTop(){
        if(top==-1){
            System.out.println("Stack Underflow!!!");
            return null;
        }
        else{
            return Arr.get(top);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack undefrlow!!!"); 
        }
        else{
            top--;
        }
    }

    public String tostring(){
        String ans="";
        for(int i=0;i<top;i++){
            ans+=String.valueOf(Arr.get(i))+"->";
        }
        ans+=String.valueOf(Arr.get(top));
        return ans;
    }
}

public class GenericStack {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of Generic Stack :");
        int n=ob.nextInt();
        Stack<Integer> st=new Stack<>(n); 
        int v;
        for(int i=0;i<n;i++){
            System.out.println("Element :");
            v=ob.nextInt();
            st.push(v);
        }
        System.out.println(n+" Elements pushed into stack :"+st.tostring());
        st.pop();
        System.out.println("Stack after pop :"+st.tostring());
    }
}
