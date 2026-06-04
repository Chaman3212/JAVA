package Strings;

import java.util.Scanner;

public class primeNumber {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count =0;
        // faster approch
        for(int i =2;i*i<=n;i++){
            if(n%i ==0){
                count++;
            }
        }

        //slower approch
//        for(int i=2;i<n-1;i++){
//            if(n%i==0){
//                count++;
//            }
//        }


        //condition
        if(count>1){
            System.out.println("Not a Prime Number");
        }else{
            System.out.println("Prime Number");
        }
    }
}
