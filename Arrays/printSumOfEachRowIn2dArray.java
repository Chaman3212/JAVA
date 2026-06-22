package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class printSumOfEachRowIn2dArray {
    public static ArrayList<Integer> sumOfEachRow(int[][] nums ){
        ArrayList<Integer> list = new ArrayList<>();
       for(int j=0;j<nums[0].length;j++){
           int sum =0;
           for (int i = 0; i < nums.length; i++) {
               sum +=nums[i][j];
           }




           list.add(sum);
       }
        return list;
    }

    static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfEachRow(nums));
    }
}
