package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicates {
    public static void removeDuplicateFromArray(int arr[]){
        int i=0,j=1,n=arr.length;
        while (j<n){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                j++;
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4};
        removeDuplicateFromArray(arr);
    }

}
