package LeetCode;

public class ElementSumDiff {
    public static void main(String[] args) {
int [] nums = {21,14,32};
int ans = differenceOfSum(nums);
        System.out.println(ans);
    }
    public static int differenceOfSum(int[] nums) {
int arraySum = 0;
int rem,quo,sum=0,num;
        for (int i = 0; i < nums.length; i++) {
            arraySum+=nums[i];
        }
        System.out.println(arraySum);
//        digits sum
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            while (num > 0){
                rem = num%10;
                sum+=rem;
                quo = num/10;
                num=quo;
            }
        }
        return arraySum - sum;
    }
}
