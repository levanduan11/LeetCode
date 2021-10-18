package stack;

import java.util.Stack;

public class Histogram {
    public static int largestRectangleArea(int[] heights){
        Stack<Integer>stack=new Stack<>();
        int max=0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty()&&heights[stack.peek()]>heights[i]){
                int k=stack.peek();
              stack.pop();
              if(stack.empty()){
                  max=i*heights[k];
              }else {
                  max=heights[k]*(i-stack.peek()-1);
              }
            }

            stack.push(i);
        }
        return max;
    }
    public static int largestRectangleArea1(int[] heights) {
        int n=heights.length;
    int max=0;
    int maxs=0;
    int i=0;
    Stack<Integer>stack=new Stack<>();
    while (i<n){
        if(stack.isEmpty()||heights[stack.peek()]<=heights[i]){
            stack.push(i++);
        }else {
            int t=stack.peek();
            stack.pop();
            maxs=heights[t]*(stack.isEmpty()?i:i-stack.peek()-1);
        }
        max=Math.max(maxs,max);
    }
    while (!stack.isEmpty()){
        int t=stack.peek();
        stack.pop();
        maxs=heights[t]*(stack.isEmpty()?i:i-stack.peek()-1);
        max=Math.max(maxs,max);
    }
    return max;
    }

    public static void main(String[] args) {
        int arr[]={2,4};
        System.out.println( largestRectangleArea(arr));
    }
}
