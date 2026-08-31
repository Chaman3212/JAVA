package slidingWIndow;

public class codeForeces_qus_279b {
    public static void maximumNoOfBooks(int[] arr , int n, int t){
       int left =0, right =0, sum =0, res =0;
        for (int i = 0; i < n; i++) {
            sum += arr[right];
            while (sum > t){
                sum -= arr[left];
                left++;
            }
            res = Math.max(res , right-left+1);
            right++;
        }
        System.out.println(res);
    }
    static void main(String[] args) {
        int[] arr = {1,1,2,1};
        int n = 4;
        int t = 5;
        maximumNoOfBooks(arr, n, t);
    }
}
