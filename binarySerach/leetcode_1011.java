package binarySerach;

public class leetcode_1011 {
    public static void shipWithinDays(int[] arr){
       int st =0;
       int end=0;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
        }
        System.out.println(end);
    }

   public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //System.out.println(shipWithinDays(arr));
        shipWithinDays(arr);
    }
}
