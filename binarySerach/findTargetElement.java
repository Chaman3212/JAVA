package binarySerach;

public class findTargetElement {
    public static int findTargetElem(int[] nums  , int k){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
      while (start <= end){
          if(nums[mid]==k){
              return  mid;
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
        int[] nums = {10,20,30,40,50,60,80};
        System.out.println(findTargetElem(nums,80));

    }
}
