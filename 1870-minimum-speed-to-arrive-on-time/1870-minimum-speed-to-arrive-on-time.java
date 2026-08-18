class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
      int l=1;
      int h=10000000;
      if (hour <= dist.length - 1) return -1; 
       int ans=-1;

      while(l<=h){
        int mid=l+(h-l)/2;
        if(isvalid(dist,hour,mid)){
            ans=mid;
            h=mid-1;
        }else{
            l=mid+1;
        }
      }
      return ans;
    }

      private boolean isvalid(int[] dist, double hour,int mid){
        double count=0;
        
        for(int i = 0; i < dist.length - 1; i++){
            count+=(dist[i]+mid-1)/mid;
        }
        count+=(double)dist[dist.length-1]/mid;
        return count<=hour;
      }
    }
