package DPandR;

public class MinimumPathSum {
    public static int m(int a,int b,int grid[][]){
        if(a==1||b==1)return grid[a-1][b-1];
        return Math.min( m(a-1,b,grid),m(a,b-1,grid));
    }
    public static int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for (int i = 1; i <grid.length ; i++) {
            grid[i][0]=grid[i][0]+grid[i-1][0];
        }
        for (int i = 1; i <grid[0].length ; i++) {
            grid[0][i]=grid[0][i]+grid[0][i-1];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j]=grid[i-1][j]>grid[i][j-1]? grid[i][j]+grid[i][j-1] :grid[i][j]+grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(m(3,3,arr));
    }
}
