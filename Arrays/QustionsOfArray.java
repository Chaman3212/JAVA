package Arrays;

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

    static void main(String[] args) {
        int[] arr = {1,2,33,45,665,7,44};
//        System.out.println(printAvg(arr));
//        System.out.println("the maximum value form the arr is "+findMax(arr));
//    print positive and negative sum of an array
//        int[] arr2 = {-1,2,-3,4,-5,6};
//        postiveNegativeSum(arr2);

        int[] array = {1,2,3,4,5,4,6,7};
        getUnsorted(array);



    }
}
