package Arrays;

import java.util.Arrays;

public class pivotIndex {
    static int findPivotIndex(int nums[]){
        int n = nums.length;
        int[] rightSum = new int[n];
        int[] leftSum = new int[n];
        rightSum[0]=nums[0];
        for (int i = 1; i < n-1; i++) {
            rightSum[i]=nums[i]+rightSum[i-1];
        }
        leftSum[n-1]=nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            leftSum[i]=nums[i]+leftSum[i+1];
        }
        for (int i = 0; i < n-1 ;i++) {
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }

        return 0;
    }

    static void main(String[] args) {

        int[] nums = {1,7,3,6,5,6};
        System.out.println(findPivotIndex(nums));

    }
}
