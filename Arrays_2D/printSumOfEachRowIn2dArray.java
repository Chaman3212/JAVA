package Arrays_2D;

import java.util.ArrayList;

public class printSumOfEachRowIn2dArray {
    public static ArrayList<Integer> printSumOfEachRow(int[][] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = 0; j < nums[i].length; j++) {
                sum+=nums[i][j];
            }
            list.add(sum);
        }
        return list;
    }

    static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printSumOfEachRow(nums));
    }
}
