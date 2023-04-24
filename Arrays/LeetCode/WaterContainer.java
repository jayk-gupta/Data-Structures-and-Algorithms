package LeetCode;

public class WaterContainer {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println( maxArea_(arr));
    }
//    brute force
    public static int maxArea(int[] height) {
        int max = 0;
        int s =0;
        int e =height.length-1;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j <height.length ; j++) {
                int amount = (j-i)*(Math.min(height[i],height[j]));
                if (max < amount) max = amount;
            }
        }
      return max;
    }
//    Two pointer
public static int maxArea_(int[] height) {
    int max =0;
    int s =0;
    int e =height.length-1;
   while (s<e){
       int currentArea =0 ;
       if (height[s] <= height[e]){
           currentArea = (e-s)* height[s];
           s++;
       }
       else {
           currentArea = (e-s)* height[e];
           e--;

       }
       if (currentArea>max) max = currentArea;
   }
    return max;
}

}
