package CollegeWallah;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 23, 3, 8};
        int ans = findSecondLargest(arr, arr.length);
        System.out.println(ans);
    }

    static int findSecondLargest(int[] arr, int n) {
        int max1 = findMax(arr, n);
        for (int i = 0; i < n; i++) {
            if (arr[i] == max1){
                arr[i] = Integer.MIN_VALUE;
            }
        }
       int max2 = findMax(arr,n);
        return max2;
    }

    static int findMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
