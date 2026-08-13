class Solution {
    public int maxDistance(int[] arr, int k) {
   Arrays.sort(arr);
        int low=1;
        int high=0;
        int ans=0;
        for(int cow: arr){
            
            high=Math.max(high, cow);
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isvalid(arr, k, mid)){
                ans=mid;
                low=mid+1;
            }else{
                
                high=mid-1;
            }
        }
        return ans;
    }
    private boolean isvalid(int[] arr, int k,int mid){
        int count=1;
        int dis=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-dis>=mid){
                count++;
                dis=arr[i];
            }
            if (count >= k) return true;
        }   
        return false;
    }
}