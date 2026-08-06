class Solution {
    public int missingNumber(int[] nums) {
     int n= nums.length;
     int arrsum=0;

     int sum=n*(n+1)/2;
     for(int i=0;i<n;i++){
        arrsum+=nums[i];
     }   
    int  diff=sum-arrsum;
    return diff;
     
    }
}