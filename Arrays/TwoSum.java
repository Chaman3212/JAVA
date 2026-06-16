package Arrays;

public class TwoSum {
    public static void twoSum(int arr[],int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <= arr.length-1; j++) {
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
        System.out.println("No match found ");
    }
    static void main(String[] args) {

        int[] arr = {2,1,3,5,4,6};
        twoSum(arr,10);
    }
}
