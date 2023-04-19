package GFG;

public class ArraySum {
    public static void main(String[] args) {
long [] arr = {1,2,3,4,5,6,7,8};
long ans = getSum(arr,arr.length);
        System.out.println(ans);
    }
    public static long getSum(long a[], long n)
    {
        long sum =0;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        return sum;
    }
}
