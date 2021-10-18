package test;

import java.util.*;

public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();

        if(root==null)return res;
        queue.offer(root);
        int lev=0;
        while (!queue.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int s=queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode curr=queue.poll();
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
            }

            if(lev%2==1){
                Collections.reverse(list);
            }
            res.add(list);
            lev++;
        }
return res;
    }
    public static void main(String[] args) {

    }
}