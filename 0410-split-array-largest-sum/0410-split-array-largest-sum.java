class Solution {
    public int splitArray(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }
        
        long ans =-1;
        long low=0;
        long high=0;
        for(int num : arr){
          low=Math.max(low, num);
            high+=num;
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isvalid(arr, mid, k)){
               ans = mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
    private boolean isvalid(int[] arr,long mid,int k){
        int count=1;
        int cpages=0;
        for(int pages : arr){
            if(cpages+pages>mid){
                cpages=pages;
                count++;
                
            }
            else{
                cpages+=pages;
            }
        }
        return count<=k;
    }

}