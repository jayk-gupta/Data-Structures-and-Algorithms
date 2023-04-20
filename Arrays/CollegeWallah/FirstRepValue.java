package CollegeWallah;

public class FirstRepValue {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int ans = findRepeatValue(arr);
        System.out.println(ans);
    }
    static int findRepeatValue(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return  arr[i];
            }
        }
        return -1;
    }
}
