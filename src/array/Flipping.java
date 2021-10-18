package array;

public class Flipping {
    public static int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
    public int[][] flipAndInvertImage1(int[][] image) {
int n=image.length;
int m=image[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2; j++) {
                int tmp=image[i][j];
                image[i][j]=image[i][m-j-1];
                image[i][m-j-1]=tmp;
            }

        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(image[i][j]==1){
                    image[i][j]=0;
                }else {
                    image[i][j]=1;
                }
            }

        }
        return  image;
    }

    public static void main(String[] args) {
int[][]arr={{1,1,0},{1,0,1},{0,0,0}};
int res[][] =flipAndInvertImage(arr);
        for (int []a:res) {
            for (int k:a) {
                System.out.print(k);

            }
            System.out.println();
        }



    }
}
