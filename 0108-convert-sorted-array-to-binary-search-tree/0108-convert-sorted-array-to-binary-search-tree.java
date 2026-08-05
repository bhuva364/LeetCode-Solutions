
class Solution {
    public TreeNode making (int[] nums , int i , int j){
        if(i>j) return null;
        int mid = (i+j)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = making(nums,i,mid-1);
        root.right= making(nums,mid+1,j);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
     int n =nums.length;
     return making(nums,0,n-1);

    }
}