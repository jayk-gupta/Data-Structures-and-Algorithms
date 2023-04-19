package LeetCode;

public class MaxProductNums {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int ans = maxProduct(arr, arr.length);
        System.out.println(ans);
    }

    public static int maxProduct(int[] nums, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = (nums[i] - 1) * (nums[j]-1);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }
}
