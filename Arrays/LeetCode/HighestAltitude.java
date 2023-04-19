package LeetCode;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {32};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain) {
        if (gain.length == 1){
            return Math.max(gain[0], 0);
        }
        int[] alt = new int[gain.length+1];
        alt[0] = 0;
        alt[1] = gain[0];

        alt[2] = alt[1]+gain[1];
        for (int i = 3; i < alt.length; i++) {
            alt[i] = alt[i-1] + gain[i-1];
        }
        System.out.println(Arrays.toString(alt));
        int max = alt[0];
        for (int i = 0; i < alt.length; i++) {
            if (max < alt[i]){
                max = alt[i];
            }
        }

        return max ;
    }
}
