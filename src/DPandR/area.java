package DPandR;

import java.util.Stack;

public class area {
    public static int maximalRectangle(char[][] matrix) {
        if(matrix.length==0)return 0;
    int dp[]=new int[matrix[0].length];
    int max =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                if(matrix[i][j]=='1'){
                    dp[j]=dp[j]+1;
                }else {
                    dp[j]=0;
                }


            }
            max=Math.max(max,geth(dp));
        }



return max;

    }
    static int geth(int[] h) {
        int n = h.length;
        int max = 0;
        int maxarea = 0;
        int i = 0;
        int tp;
        Stack<Integer> stack = new Stack<>();
        while (i < n) {
            if (stack.isEmpty() || h[stack.peek()] <= h[i]) {
                stack.push(i++);
            } else {
               tp = stack.peek();
                stack.pop();
                maxarea = h[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            }
            max = Math.max(maxarea, max);
        }
        while (!stack.isEmpty()) {
           tp = stack.peek();
            stack.pop();
            maxarea = h[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            max = Math.max(maxarea, max);
        }
   return max;
    }

    public static void main(String[] args) {
//        int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
//        System.out.println(geth(hist));
        char[][] a={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        System.out.println(  maximalRectangle(a));
    }
}
