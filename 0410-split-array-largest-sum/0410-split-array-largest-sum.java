class Solution {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k) return -1;

        int low=0;
        int high=0;
        for(int num: nums){
            low=Math.max(low, num);
            high+=num;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(isvalid(nums, k, mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    private boolean isvalid(int[] nums, int k, int mid){
        int count=1;
        int cs=0;
       for(int num:nums){
        if(cs+num>mid){
            count++;
            cs=num;
        }else{
            cs+=num;
        }
       }
       return count<=k;
    }
}