package CollegeWallah;

public class UniqueNUm {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,1,2};
        System.out.println( uniqueNUm(arr));
    }
    static int uniqueNUm(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                return arr[i];
            }
        }
        return -1;
    }

}
