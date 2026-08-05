package binarySerach;

public class SortedInRotatedArray {
    public static int SortedInRotatedArray(int[] nums, int k){
        int st = 0, end = nums.length-1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] == k){
                return mid;
            }else if(nums[st] <nums[mid]){
                if(nums[st] <= nums[mid] && nums[mid] > k){
                    end = mid -1;
                }else{
                    st = mid+1;
                }
            }else{
                if(nums[mid]<k && k<= nums[end]) {
                    st = mid + 1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] nums = {10,15,16,19,22,5,7,9};
        System.out.println(SortedInRotatedArray(nums,5));
    }
}
