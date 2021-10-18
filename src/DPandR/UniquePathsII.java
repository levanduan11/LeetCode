package DPandR;

public class UniquePathsII {
    public static int uniquePathsWithObstacles1(int[][] obstacleGrid) {

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;

        // If the starting cell has an obstacle, then simply return as there would be
        // no paths to the destination.
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        // Number of ways of reaching the starting cell = 1.
        obstacleGrid[0][0] = 1;

        // Filling the values for the first column
        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        // Filling the values for the first row
        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }

        // Starting from cell(1,1) fill up the values
        // No. of ways of reaching cell[i][j] = cell[i - 1][j] + cell[i][j - 1]
        // i.e. From above and left.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        // Return value stored in rightmost bottommost cell. That is the destination.
        return obstacleGrid[R - 1][C - 1];
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int c=0;
if(obstacleGrid[0][0]==1||obstacleGrid[n-1][m-1]==1)return 0;
       if(n==1){
           boolean check=true;
           for (int i = 0; i < m; i++) {
               if(obstacleGrid[0][i]==1){
                  check=false;
                  return 0;

               }
           }
           if(check)return 1;

       }
       if(m==1){
           boolean check=true;
           for (int i = 0; i <n ; i++) {
               if(obstacleGrid[i][0]==1){
                   check=false;
                   return 0;
               }

           }
           if(check)return 1;

       }


int t[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            if(obstacleGrid[i][0]!=1){
                t[i][0]=1;
            }else {
                break;
            }


        }
        for (int i = 0; i < m; i++) {
            if(obstacleGrid[0][i]!=1){
                t[0][i]=1;
            }else {
                break;
            }

        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(obstacleGrid[i][j]==1){
                    t[i][j]=0;
                }
                else
                t[i][j]=t[i-1][j]+t[i][j-1];
            }

        }
        return t[n-1][m-1];

    }

    public static void main(String[] args) {
        int arr[][]= {{0,0}};
        System.out.println(uniquePathsWithObstacles1(arr));
    }
}
