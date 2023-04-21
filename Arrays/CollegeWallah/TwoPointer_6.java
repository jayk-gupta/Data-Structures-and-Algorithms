package CollegeWallah;

public class TwoPointer_6 {
    public static void main(String[] args) {
        int[] arr ={0,2,4,1,3,6,7,11,20,32,3};
        int ans  = findSum(arr,4,7);
        System.out.println(ans);
    }
    static int findSum(int[] arr,int start,int end){
int sum =0;
        while(start <= end){
           sum+= arr[start];
           start++;
        }
            return sum;
    }
}
