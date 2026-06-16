package Arrays;

import java.util.HashMap;

public class firstRepatingNumber {
    //SLOW APPROCH
    static int findFirstRepatingNumber(int arr[]){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    // FAST APPROCH BY USING HASHMAP
    static int findFirstRepatingNumber2nd(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int i:nums){
            if(map.get(i)>1){
                return i;
            }
        }
        return 0;
    }

    static void main(String[] args) {
        int[] nums = {10,5,3,4,3,5,6};
        //System.out.println("the first repating number is : "+findFirstRepatingNumber(nums));
        System.out.println("the first repating number is : "+findFirstRepatingNumber2nd(nums));

    }
}
