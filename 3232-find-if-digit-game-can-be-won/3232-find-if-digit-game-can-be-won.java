class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doub=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                doub+=nums[i];
            }else{
                single+=nums[i];
            }
        }
        return single!=doub;
    }
}