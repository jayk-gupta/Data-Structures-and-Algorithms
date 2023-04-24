package CollegeWallah;

import java.util.Arrays;

public class PrefixSuffixSum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
        System.out.println(Arrays.toString(arr));
        boolean ans = findPrefixSum(arr);
        System.out.println(ans);
    }

    static boolean findPrefixSum(int[] arr) {
        int prefSum = 0;
        int suffSum = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum+= arr[i];
        }
        for (int i = 0; i < arr.length-1; i++) {
            prefSum += arr[i];
            suffSum = totalSum-prefSum;
            if (prefSum == suffSum) return  true;
        }

  return false;
    }
   
}
