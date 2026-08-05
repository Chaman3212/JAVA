package binarySerach;

import java.util.HashMap;

public class findElementNotInPair {
    public static int findElementNotInPair(int[] nums ){
        int start = 0;
        int end = nums.length-1;
        int mid = start+(end - start)/2;
        while (start <= end){
           if(mid%2==0){
               if(nums[mid]==nums[mid+1]){
                   start=mid+2;
               }else{
                   end=mid;

               }
           }else if(nums[mid]==nums[mid+1]){
               end=mid-2;
           }else{
               return mid;
           }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(findElementNotInPair(nums));

    }
}
