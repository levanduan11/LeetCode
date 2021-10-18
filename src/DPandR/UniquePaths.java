package DPandR;

public class UniquePaths {
    public static int countPathsRecursive(int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return countPathsRecursive(n-1, m) + countPathsRecursive(n, m-1);
    }
    public static int uniquePaths(int m, int n) {
int t[][]=new int[m][n];
        for (int i = 0; i <n; i++) {
            t[0][i]=1;
        }
        for (int i = 0; i < m; i++) {
            t[i][0]=1;
        }
        for (int i = 1; i <m; i++) {
            for (int j = 1; j < n; j++) {
                t[i][j]=t[i-1][j]+t[i][j-1];
            }
        }
        return t[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
        System.out.println(countPathsRecursive(3,2));
    }
}
