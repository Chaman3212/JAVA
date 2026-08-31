package Recursion;

public class maxElementUsingRecursion {

    public  static int findMaxUsingRecursion(int[] arr , int i, int max){
       if(i >= arr.length){
           System.out.println(max);
           return max;
       }
       if(arr[i]>max){
           max = arr[i];
       }
       findMaxUsingRecursion(arr, i+1, max);
       return max;
    }
    static void main(String[] args) {
        int[] arr = {22,3,12,43,55,65,43, 77};
        findMaxUsingRecursion(arr,0,0);
    }
}
