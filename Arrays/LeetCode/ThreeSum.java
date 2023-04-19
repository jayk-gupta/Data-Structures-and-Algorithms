package LeetCode;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

    }
    public static List<Integer> threeSum(int[] nums) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] +nums[j]+nums[j+1] == 0 ){
//                    list1.add(new int[]{nums[i], nums[j], nums[j + 1]});
                }
            }
        }
        return list1;
    }
}
