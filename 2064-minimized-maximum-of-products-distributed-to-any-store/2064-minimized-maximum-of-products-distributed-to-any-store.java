class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        long low=1;
        long high=0;
        long ans=-1;
        for(int q: quantities){
            high=Math.max(high, q);
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isvalid(n, quantities, mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)ans;
    }

    private boolean isvalid(int n, int[] quantities, long mid){
        
        int cd=0;
        for(int q: quantities){
           cd+=(q+mid-1)/mid;
        }
        return cd<=n;
    }
}