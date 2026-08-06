class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for ( int w : weights){
           low = Math.max(low,w);
           high+=w;
        }

        while (low < high){
            int mid= ( low + high)/2;
            int dayNeed=1, currWeight=0;

            for (int w : weights){
                if ( currWeight + w > mid ){
                    dayNeed++;
                    currWeight = 0;
                }
                currWeight += w;
            }
            if ( dayNeed > days){
                low= mid +1 ;
            }else {
                high = mid ;
            }

        }
        return low;
        
    }
}