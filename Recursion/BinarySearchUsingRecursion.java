package Recursion;

public class BinarySearchUsingRecursion {
    public static int  bSearchUsingRecursion(int st , int end, int target, int[] arr ){
        if(st > end){
            return -1;
        }
        int mid = st + (end - st)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]< target){
           return bSearchUsingRecursion( st = mid+1 , end, target, arr);
        }else{
            return bSearchUsingRecursion( st , end = mid-1, target, arr);
        }

    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7, st = 0, end = arr.length-1;
        System.out.println(bSearchUsingRecursion(st, end, target, arr));;
    }
}
