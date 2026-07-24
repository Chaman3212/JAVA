package sortingAlgo;

import java.util.Arrays;

public class selectionSort {
   public static int[] selection_Sort(int[] nums ){
       for (int i = 0; i < nums.length-1; i++) {
           int min = i;
           for (int j = i+1; j < nums.length; j++) {
               if(nums[j]<nums[min]){

                   min=j;
               }
           }
           int temp =nums[i];
           nums[i]=nums[min];
           nums[min]=temp;
       }
       return nums;
   }

   public static void min(int[] nums){
       int min=nums[0];
       for (int i = 0; i < nums.length; i++) {
           if(nums[i]<min){
               min=nums[i];
           }
       }
       System.out.println(min);
   }

    public static void main(String[] args){
        int[] nums = {1,3,4,2,7,5,6};
        System.out.println(Arrays.toString(selection_Sort(nums)));
        //min(nums);
    }
}
