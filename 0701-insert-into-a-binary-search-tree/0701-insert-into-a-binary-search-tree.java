
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode temp = root;
        TreeNode q = null;
       insert(temp,val,q);
    return temp;
    }
    TreeNode insert(TreeNode temp,int val,TreeNode q){
        if(temp==null){
            temp = new TreeNode(val);

            if(q.val>temp.val) q.left = temp;
            else q.right= temp;
             
            return temp;
        }

        if(temp.val>val){
            q = temp;
           return  insert(temp.left,val,q);
        }
        else{
            q= temp;
            return insert(temp.right,val,q);
        }
    } 
}