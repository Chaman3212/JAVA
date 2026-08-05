public class searchInserPosition35 {
    public static int searchInsertPosition(int[] nums , int k) {
        int s = 0, e = nums.length - 1, ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == k) {
                return mid;
            } else if (k < nums[mid]) {
                e = mid - 1;
            } else {
                ans = mid + 1;
                s = mid + 1;
            }
        }
            return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,9};
            System.out.println(searchInsertPosition(nums,8));
    }
}
