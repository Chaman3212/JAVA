package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class QustionsOfArray {
    public static float printAvg(int[] arr){
        float totalElement = arr.length;
        float sumOfElement = 0;
        for(int i=0;i<arr.length;i++){
            sumOfElement+=arr[i];
        }
        float res = sumOfElement/totalElement;
        return res;
    }
    public static int findMax(int[] arr){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void reverseArray(int arr[]){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void postiveNegativeSum(int[] arr){
        double positive =0,negative=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                positive+=arr[i];
            }else{
                negative+=arr[i];
            }
        }
        System.out.println("Positive sum is "+positive);
        System.out.println("Negative sum is "+negative);

    }
    public static void getUnsorted(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                System.out.println("Unsorted Element is "+arr[i+1]+" on index "+i);
                break;

            }
        }

    }

    public static void rightShiftArray(int arr[]){
        for (int j = 0; j < 3; j++) {

        int last = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int getMod(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxFreq =0;
        int maxFreqWaliKey=0;

        for(int key : map.keySet()){
            int currKeyFreq = map.get(key);
            if(currKeyFreq>maxFreq){
                maxFreq=currKeyFreq;
                maxFreqWaliKey=key;
            }
        }
        return maxFreqWaliKey;
    }

    static void main(String[] args) {
//        int[] arr = {1,2,33,45,665,7,44};
//        System.out.println(printAvg(arr));
//        System.out.println("the maximum value form the arr is "+findMax(arr));
//    print positive and negative sum of an array
//        int[] arr2 = {-1,2,-3,4,-5,6};
//        postiveNegativeSum(arr2);

//        int[] array = {1,2,3,4,5,4,6,7};
//        getUnsorted(array);


//        reverseArray(arr);



//            rightShiftArray(arr);


        int[] arr = {1,1,1,1,1,1,2,2,2,3,3,4,4,4,5,5,6};
        System.out.println(getMod(arr));;
    }
}
