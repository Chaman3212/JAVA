package Recursion;

public class printDigitsUsingRecursion {
    public static void printDigits(int n){
        if(n<=0){
            return;
        }
        printDigits(n/10);
        System.out.print(n%10 + " ");
    }
    static void main(String[] args) {
        int n = 232324;
        printDigits(n);
    }
}
