package DPandR;

public class Submatrices {
    public static int countSquares(int[][] matrix) {
        int res[][]=new int[matrix.length][matrix[0].length];
        int cout=0;
        for (int i = 0; i < matrix[0].length; i++) {
            res[0][i]=matrix[0][i];
        }
        for (int i = 0; i < matrix.length; i++) {
            res[i][0]=matrix[i][0];
        }
        for (int i = 1; i < res.length; i++) {
            for (int j = 1; j <res[0].length ; j++) {
                if(matrix[i][j]==1){
                    res[i][j]=matrix[i][j]+Math.min(Math.min(res[i][j-1],res[i-1][j-1]),res[i-1][j]);

                }

            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j <res[0].length ; j++) {
                cout+=res[i][j];
            }
        }
        return cout;
    }
    public static void main(String[] args) {
        int res[][]={{1,0,1},{1,1,0},{1,1,0}};
        System.out.println(countSquares(res));
    }
}
