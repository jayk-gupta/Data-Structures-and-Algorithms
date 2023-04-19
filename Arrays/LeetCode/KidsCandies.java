package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
       List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<Boolean>();
        int max = candies[0];
//     find max
        int[] extra = new int[0];
        for (int i = 0; i < candies.length-1; i++) {
            if (max < candies[i + 1]) {
                max = candies[i + 1];
            }
        }
//            add extra candies
            extra = new int[candies.length];
            for (int j = 0; j < candies.length; j++) {
                extra[j] = candies[j] + extraCandies;
            }

        System.out.println(max);
        System.out.println(Arrays.toString(candies));
        System.out.println(Arrays.toString(extra));
//        compare
        for (int i = 0; i < extra.length; i++) {
            if (extra[i] >= max) {
                l.add(true);
            }
else {
    l.add(false);
            }
        }
        return l;
    }
}
