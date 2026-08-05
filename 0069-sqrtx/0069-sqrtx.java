class Solution {
    public int mySqrt(int x) {
      int l=0;
      int h=x;
      while(l<=h){
        int mid=l+(h-l)/2;
      long s=(long)mid*mid;
      if(s==x){
        return mid;
      }
      else if(s<x){
        l=mid+1;
      }else{
        h=mid-1;
      }
      }
      return h;
    }
}