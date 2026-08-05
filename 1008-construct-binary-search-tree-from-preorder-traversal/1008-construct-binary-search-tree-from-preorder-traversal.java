
class Solution {
    int i=0;
    public TreeNode bst(int[] preorder, int v){
        if(i==preorder.length || preorder[i]>v){
            return null;
        }
        TreeNode child = new TreeNode(preorder[i++]);
        child.left=bst(preorder, child.val);
        child.right=bst(preorder, v);
        return child;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder, Integer.MAX_VALUE);
    }
}