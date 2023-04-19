package GFG;

public class SearchInSorted {
    public static void main(String[] args) {
        int[] arr = {1,4,7,11,21,34,38};
        int ans = searchInSorted(arr,arr.length,34);
        System.out.print(ans);
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        int start = 0;
        int end = arr.length-1;
       while (start<=end) {
           int mid = start + (end - start) / 2;
//           case=1
           if (arr[mid] == K){
               return 1;
           }
           else if (arr[mid]<K){
               start = mid+1;
           }
           else{
               end = mid-1;
           }
       }
  return -1;
    }
}
