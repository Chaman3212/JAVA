package binarySerach;

import java.sql.SQLOutput;

public class findLowerBound {
    public static int findLowerBoundInBinarySearch(int[] nums,int k){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        while (start <= end){
            if(nums[mid]==k){
                if(nums[mid]!=nums[mid-1]) {
                    return mid;
                }else if(nums[mid]==nums[mid-1]){
                    mid=mid-1;
                }
            }else if(nums[mid]<k){
                start=mid+1;
            }else {
                end=mid-1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }

    static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,8,12,15};
        System.out.println(findLowerBoundInBinarySearch(nums,3));
    }
}
