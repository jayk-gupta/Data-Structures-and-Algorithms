package LeetCode;
// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/ nn
public class LargestPositiveInteger {
    public static void main(String[] args) {
    int[] arr = {-1,2,-3,3,4};
        System.out.println(findMaxK(arr));
    }
    public static int findMaxK(int[] nums) {
//        find max
        int max1 = findMax(nums,0);
        int max2 = 0;
    int i=0;
            while(nums[i] + max1 != 0 ) {
                for ( i=0 ; i <nums.length ; i++) {
                max2 = findMax(nums,max1);
            };

        }
    return -1;
    }
//    max function
    public  static int findMax(int[] nums,int max1){
        int max = 0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] > max && max!=max1 ) max = nums[i];
        }
        return max;
    }
}
