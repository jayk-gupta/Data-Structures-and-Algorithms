package CollegeWallah;

import java.util.Arrays;


public class TwoPointer {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(nums));
        twoPointerMethod(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void Countzeroes(int[] arr) {
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) zeroes++;
        }
        for (int i = 0; i <= arr.length - zeroes; i++) {
            arr[i] = 0;
        }
        for (int j = zeroes; j < arr.length; j++) {
            arr[j] = 1;
        }
    }

    //    Two Pointer approach
    static void twoPointerMethod(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                swap(arr, start, end);
                start++;
                end--;
            }
            if (arr[start] == 0) start++;
            if (arr[end] == 1) end--;
        }

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
