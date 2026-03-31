public class recursion {
    static void shownum(int n) {
        if (n == 0) {
            return;  //base case
        } else {
            shownum(n - 1);  //recursive call
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        shownum(5);  //first call
    }
}