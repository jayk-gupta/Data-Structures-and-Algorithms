package CollegeWallah;

import java.util.Arrays;

public class TwoPointerSquare {
    public static void main(String[] args) {
        int[] arr ={-10,-3,-2,1,4,5};
    int[] ans =findSqrArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findSqrArray(int[] arr ){
        int[] ans = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int k=0;
        while(start <= end){
            if (Math.abs(arr[start]) > Math.abs(arr[end])){
                ans[k++] = arr[start]*arr[start];
                start++;
            }
            else{
                ans[k++] = arr[end]*arr[end];
                end--;
            }

        }
        return ans;
    }

}
