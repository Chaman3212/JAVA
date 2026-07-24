package sortingAlgo;

import java.util.Arrays;

public class bubbleSort {

    public static int[] bubble_sort(int nums[]){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                int temp;
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
    static void main(String[] args) {
        int[] nums = {3,4,1,2};
        System.out.println(Arrays.toString(bubble_sort(nums)));
    }
}
