package binarySerach;

public class findMinInRotatedSortedArray {

    public static int findMinInRotatedSortedArray(int[] nums){
        int st =0,end = nums.length-1;
        int mid = st+(end- st)/2;
        int min = mid;
        while (st <= end){
            if(nums[st]> nums[mid]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return nums[mid];

    }

    static void main(String[] args) {
        int[] nums = {12,15,17,18,20,4,7,8,9,10};
        System.out.println(findMinInRotatedSortedArray(nums));
    }
}
