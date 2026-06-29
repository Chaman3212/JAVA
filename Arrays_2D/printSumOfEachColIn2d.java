package Arrays_2D;

import java.util.ArrayList;

public class printSumOfEachColIn2d {
    public static ArrayList<Integer> printSumOfEachCol(int[][] nums){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums[0].length; i++) {
            int sum =0;
            for (int j = 0; j < nums.length; j++) {
                sum+=nums[j][i];
            }
            list.add(sum);
        }
        return list;
    }

    static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printSumOfEachCol(nums));
    }
}
