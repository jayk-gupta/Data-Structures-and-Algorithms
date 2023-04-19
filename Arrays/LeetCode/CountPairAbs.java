package LeetCode;

public class CountPairAbs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
int ans = countKDifference(arr,1);
        System.out.println(ans);
    }

    public static int countKDifference(int[] nums, int k) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (Math.abs(nums[j] - nums[i]) == k){
                    count++;
                }
            }
        }

        return count;
    }
}
