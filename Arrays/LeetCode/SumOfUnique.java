package LeetCode;

public class SumOfUnique {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1,1};
        int ans = sumOfUnique(arr);
        System.out.println(ans);
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] == nums[j]){
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
    return sum;
    }
}
