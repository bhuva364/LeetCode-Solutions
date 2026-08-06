class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
       int sum=Integer.MIN_VALUE;
       int csum=0;
       for(int i=0;i<n;i++){
        csum+=nums[i];
        sum=Math.max(sum,csum);
        if(csum<0){
            csum=0;
        }
       }
       return sum;
    }
}
