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
            for(int m:nums){
                if(m<min){
                    min=m;
                }
            }

        }
        int[] arr = new int[max];
        for(int i=min-1;i<max;i++){
            arr[i]=i+1;
        }
        for()




        System.out.println(Arrays.toString(arr));
        return list;

    }

    static void main(String[] args) {
        int[] arr = {1,4,2,5};
        System.out.println(findMissingElements(arr));
    }
}
