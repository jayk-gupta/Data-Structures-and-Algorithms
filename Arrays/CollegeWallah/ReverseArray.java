package CollegeWallah;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 32,14,52,23};
        System.out.println(Arrays.toString(arr));
//        Method-1
//        System.out.println(Arrays.toString(method_1(arr)));
//        Method-2
//        method_2(arr);
//        System.out.println(Arrays.toString(arr));
//        Method-3
        method_3(arr);
        System.out.println(Arrays.toString(arr));

    }

    //   Method-1: Simply reverse adding to new array
    static int[] method_1(int[] arr) {
        int j = 0;
        int[] a = new int[arr.length];
        for (int i = a.length - 1; i >= 0; i--) {
            a[j] = arr[i];
            j++;
        }
        return a;
    }

    //  Method-2:  By swapping in the same array
    static void method_2(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - 1 - i);
        }
    }

    // Method-3 :   By using two pointer method
    static void method_3(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    //    swap
    static void swap(int[] arr, int index_1, int index_2) {
        int temp = arr[index_1];
        arr[index_1] = arr[index_2];
        arr[index_2] = temp;
    }
}
