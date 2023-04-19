package GFG;

public class TwoArrayEqual {
    public static void main(String[] args) {
//        7
        long[] A = {13, 18, 19, 19, 3, 10, 2};
        long[] B = {10, 18, 10, 3, 2, 13, 19};
        boolean ans = check(A, B, A.length);
        System.out.println(ans);
    }

    public static boolean check(long A[], long B[], int N) {
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i] == B[j]){
                          flag = true;
                 }
            }
            if (!flag) return false;
        }

        return flag;
    }
}
