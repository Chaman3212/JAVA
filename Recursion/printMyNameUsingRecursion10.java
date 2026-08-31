package Recursion;

public class printMyNameUsingRecursion10 {
    public static void printName(int n){
        if(n <= 0){
            return;
        }
        System.out.println("chirag");
        printName(n-1);
    }
    static void main(String[] args) {
        int n =10;
        printName(n);
    }
}
