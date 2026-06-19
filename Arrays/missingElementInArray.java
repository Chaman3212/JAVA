package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingElementInArray {
    public static List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max=0, min =nums[0];
        for(int n:nums){
            if(n>max){
                max=n;
            }
        }
        for(int m:nums){
            if(m<min){
                min=m;
            }
        }
        int val = min;
        for(int n:nums){
            val = n ^ val;
        }
        int val2 = min;
        for (int i = min; i <=max; i++) {
            val2 = i ^ val2;
        }
        list.add(val ^ val2);
        return list;

    }

    static void main(String[] args) {
        int[] arr = {1,4,3,5};
        System.out.println(findMissingElements(arr));
    }
}
