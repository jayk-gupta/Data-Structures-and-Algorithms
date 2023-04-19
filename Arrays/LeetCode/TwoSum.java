package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
 int[] nums = {2,7,11,15};
int[] ans =  twoSum(nums,9);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
//        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+ nums[j] == target){
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
