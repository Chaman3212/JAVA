package Recursion;

public class recur {
    public static void solve(int n){
        if(n>3){
            return;
        }
        solve(n+1);
        System.out.println(n);
        solve(n+2);
    }
    static void main(String[] args) {
        int n =1;
        solve(n);
    }
}
