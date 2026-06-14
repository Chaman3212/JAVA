package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class findMissingInArray {
    public static ArrayList<Integer> findMissing(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i]==arr[i-1]+1){

            }else{
               list.add(arr[i-1]+1);
            }
        }
        return list;
    }

    static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,10};
        System.out.println(findMissing(arr).reversed());
    }
}
