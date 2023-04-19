package LeetCode;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {

        int[] heights = {1,1,4,2,1,3};
       int ans = heightChecker(heights);
        System.out.println(ans);
    }

    public static int heightChecker(int[] heights) {
        int count=0;
       int[] expected =  new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
    for (int i=0;i<heights.length;i++){
        if (heights[i] != expected[i]){
            count++;
        }
    }
        return count;
    }


}
