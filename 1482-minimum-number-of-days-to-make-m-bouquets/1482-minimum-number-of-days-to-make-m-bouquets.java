class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
      int low=0;
      int high=0;
      for(int flower: bloomDay){
        low=Math.min(low, flower);
        high=Math.max(high, flower);
      }  
      while(low<high){
        int mid=low+(high-low)/2;
        
            if(isvalid(bloomDay, m, k, mid)){
                high=mid;
            }else{
                low=mid+1;
            }
            }
            return low;
    }

    private boolean isvalid(int[] bloomDay, int m, int k,int mid){
    int count=0;
   
    int cf=0;
    for(int flower : bloomDay){
        if(flower<=mid){
            count++;
        
        if(count==k){
            cf++;
           count=0;
        }
        }
        else{
            count=0;

        
    }
    }
    return cf>=m;

    }
}