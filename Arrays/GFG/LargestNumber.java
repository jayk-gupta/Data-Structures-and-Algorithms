package GFG;

public class LargestNumber {
    public static void main(String[] args) {
      int[] arr = {2,12,4,5,21};
       int ans = largest(arr,arr.length);
        System.out.print(ans);
    }
    static int largest(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
