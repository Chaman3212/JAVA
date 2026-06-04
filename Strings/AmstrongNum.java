package Strings;
import java.util.*;

public class AmstrongNum {

    public static void amstrong(int n){
        int temp = n, temp2 = n, count =0;
        double num =0;
        while (temp >0){
            temp = temp/10;
            count++;
        }
        while (temp2 > 0) {
            int val = n%10;
            temp2 = temp2/10;
            double res = Math.pow(val,count);
            num = num+res;
        }
        if(n==num){
            System.out.println("Armstrong");
            return;
        }else {
            System.out.println("Not an armstrong");
        }
    }

    static void main(String[] args) {
        amstrong(153);
    }
}
