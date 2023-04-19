package GFG;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr ={2,2,2,2};
        boolean ans = arraySortedOrNot(arr,arr.length);
        System.out.print(ans);
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        boolean sort = false;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i-1]){
                sort =true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
