class Solution {
    public int dominantIndex(int[] nums) {
        int larg=0;
        int sec =0;
        int index=0;
        for(int i =0;i<nums.length;i++){
                if(nums[i]>larg){
                    sec=larg;
                    larg=nums[i];
                    index =i;
                }else if(sec<nums[i]){
                    sec=nums[i];
                }
        }
                if(2*sec<=larg){
                    return index;
            }
        return -1;
    }
}