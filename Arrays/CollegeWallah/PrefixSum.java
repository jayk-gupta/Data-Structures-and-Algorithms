package CollegeWallah;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6};
        System.out.println(Arrays.toString(arr));
        findSum(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void findSum(int[] arr){
        int sum=0;
        for (int i = 1; i <arr.length ; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

    }
}
