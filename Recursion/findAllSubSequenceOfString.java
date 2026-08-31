package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class findAllSubSequenceOfString {
    public static void findSubsequence(String str , int idx , String newStr ){
       if(idx == str.length()){
           System.out.println(newStr);
           return;
       }
       findSubsequence(str, idx+1,newStr+str.charAt(idx));
       findSubsequence(str, idx+1,newStr);

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx =0;
        String s ="";
        findSubsequence(str, idx, s);
    }
}
