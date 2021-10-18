package Tree;


 class TreesNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreesNode() {}
    TreesNode(int val) { this.val = val; }
    TreesNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class sumRootToLeaf {
    public static int sumRootToLeaf(TreeNode root,int sum){
        if(root==null)return 0;
        if(root.left==null&&root.right==null)return sum=(10*sum)+root.val;
        return (sumRootToLeaf(root.left,(sum*10)+root.val)+sumRootToLeaf(root.right,(sum*10+root.val)));
    }
}
