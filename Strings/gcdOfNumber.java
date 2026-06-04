package Strings;

public class gcdOfNumber {
    public static int gcdOfNumber(int a, int b){
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        return ans;
    }
    static void main(String[] args) {

        //GCD of a number
        //System.out.println(gcdOfNumber(18,12));


    }
}
