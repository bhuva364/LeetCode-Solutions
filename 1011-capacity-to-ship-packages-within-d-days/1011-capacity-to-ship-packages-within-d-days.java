class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight); 
            high += weight;              
        }
        

        while (low < high){
            int mid= ( low + high)/2;
            
            if (isvalid(weights, mid, days)){
              high=mid;
            }else {
                low=mid+1;
               
            }

        }
        return low;
        
    }

    private boolean isvalid(int[] weights,int mid,int days){
      int count=1;
      int cw=0;
        for(int weight: weights){
   if (cw + weight > mid) {
              count++;
               cw=0;
            }
            cw += weight;
    }
    return count<=days;
}
}